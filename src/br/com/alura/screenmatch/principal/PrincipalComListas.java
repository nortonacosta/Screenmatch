package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme = new Filme("O Senhor dos Anéis", 2001);
        filme.avalia(10);
        Filme filme2 = new Filme("The Matrix", 1999);
        filme2.avalia(8);
        Filme filme3 = new Filme("Blade", 2004);
        filme3.avalia(9);
        Serie serie = new Serie("Game of Thrones", 2011);

        ArrayList<Titulo> listaAssistidos = new ArrayList<>();
        listaAssistidos.add(filme);
        listaAssistidos.add(filme2);
        listaAssistidos.add(filme3);
        listaAssistidos.add(serie);
        for (Titulo item : listaAssistidos) {
            System.out.println(item.getNome());
            if(item instanceof Filme filmes && filmes.getClassificacao() > 3){
                System.out.println("Classificação " + filmes.getClassificacao());
            }
        }
        System.out.println(listaAssistidos);

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("David Fincher");
        buscaPorArtista.add("Quentin Tarantino");
        buscaPorArtista.add("George Lucas");
        buscaPorArtista.add("Peter Jackson");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Artistas ordenados: " + buscaPorArtista);

        Collections.sort(listaAssistidos);
        System.out.println("Lista ordenada de assistidos: " + listaAssistidos);

        listaAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Lista ordenada de assistidos por ano: " + listaAssistidos);

    }//fim psvm
}//fim main
