package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do filme para Busca: ");
        var busca = sc.nextLine();

        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=45f8400c";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        //System.out.println(response.body());

        String json = response.body();
        //System.out.println(json);

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);

        try{
            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Titulo Convertido");
            System.out.println(meuTitulo);
        }catch (NumberFormatException e){
            System.out.println("Ano de lancamento invalido");
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("Algum erro no arqgumento de busca, verifique o endereço");
            System.out.println(e.getMessage());
        }catch (ErroDeConversaoDeAnoException e){
            System.out.println(e.getMessage());
        }


    }
}
