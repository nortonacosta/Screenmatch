import modelos.*;
import calculos.*;

class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("O Senhor dos Anéis");
        filme.setAnoDeLancamento(2001);
        filme.setInclusoNoPlano(true);
        filme.setDuracaoEmMinutos(180);

        Filme filme2 = new Filme();
        filme2.setNome("The Matrix");
        filme2.setAnoDeLancamento(1999);
        filme2.setInclusoNoPlano(true);
        filme2.setDuracaoEmMinutos(120);

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

        Serie serie = new Serie();
        serie.setNome("Game of Thrones");
        serie.setAnoDeLancamento(2011);
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

    }
}