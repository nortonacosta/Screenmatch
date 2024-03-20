package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel
{

    private int episodio;
    private String nome;
    private Serie serie;
    private  int totalDeVisualizacoes;

    public int getTotalDeVisualizacoes()
    {
        return totalDeVisualizacoes;
    }

    public void setTotalDeVisualizacoes(int totalDeVisualizacoes)
    {
        this.totalDeVisualizacoes = totalDeVisualizacoes;
    }

    public int getEpisodio()
    {
        return episodio;
    }

    public void setEpisodio(int episodio)
    {
        this.episodio = episodio;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Serie getSerie()
    {
        return serie;
    }

    public void setSerie(Serie serie)
    {
        this.serie = serie;
    }

    @Override
    public int getClassificacao()
    {
        if (totalDeVisualizacoes > 100)
        {
            return 4;
        }else
        {
            return 2;
        }
    }
}
