package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("O Senhor dos Anéis", 2001);
        //.setNome("O Senhor dos Anéis");
        //filme.setAnoDeLancamento(2001);
        filme.setInclusoNoPlano(true);
        filme.setDuracaoEmMinutos(180);

        Filme filme2 = new Filme("The Matrix", 1999);
        //filme2.setNome("The Matrix");
        //filme2.setAnoDeLancamento(1999);
        filme2.setInclusoNoPlano(true);
        filme2.setDuracaoEmMinutos(120);

        var filme3 = new Filme("Blade", 2004);
        //filme3.setNome("Blade");
        //filme3.setAnoDeLancamento(2004);
        filme3.setInclusoNoPlano(true);
        filme3.setDuracaoEmMinutos(120);

        filme.avalia(10);
        filme.avalia(9);
        filme.avalia(8);
        filme.avalia(5);
        filme.exibeFichaTecnica();


        filme2.avalia(8);
        filme2.avalia(9);
        filme2.avalia(4);
        filme2.avalia(5);
        filme2.exibeFichaTecnica();

        Serie serie = new Serie("Game of Thrones", 2011);
        //serie.setNome();
        //serie.setAnoDeLancamento(2011);
        serie.setInclusoNoPlano(true);
        serie.setTemporadas(8);
        serie.setEpisodiosPorTemporada(8);
        serie.setMinutosPorEpisodio(50);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(filme2);
        calculadora.inclui(serie);

        System.out.println("Total de minutos: " + calculadora.getTempoTotal());
        System.out.println("********************************************");
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme);

        Episodio episodio = new Episodio();
        episodio.setEpisodio(1);
        episodio.setSerie(serie);
        episodio.setTotalDeVisualizacoes(300);
        filtro.filtra(episodio);


        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(filme);
        filmes.add(filme2);
        filmes.add(filme3);

        System.out.println("\n********* Aqui começa sobre Listas **************\n");

        System.out.println("tamanho da lista: " + filmes.size());
        System.out.println("primeiro filme: " + filmes.get(0).getNome());

    }
}