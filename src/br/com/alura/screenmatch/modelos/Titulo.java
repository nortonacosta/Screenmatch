package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>
{
   @SerializedName("Title")
    private String nome;
   @SerializedName("Year")
   private int anoDeLancamento;
    private boolean inclusoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;


    public Titulo(String nome, int anoDeLancamento)
    {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb)
    {

        this.nome = meuTituloOmdb.title();

        if(meuTituloOmdb.year().length() > 4)
        {
            throw new ErroDeConversaoDeAnoException
                    ("Não consegui converter o ano de lancamento: Mais de 04 caracteres");
        }

        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 2));
    }

    public String getNome()
    {
        return this.nome;
    }

    public int getAnoDeLancamento()
    {
        return this.anoDeLancamento;
    }

    public boolean getInclusoNoPlano()
    {
        return this.inclusoNoPlano;
    }

    public int getTotalDeAvaliacoes()
    {
        return this.totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos()
    {
        return this.duracaoEmMinutos;
    }


    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento)
    {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setInclusoNoPlano(boolean inclusoNoPlano)
    {
        this.inclusoNoPlano = inclusoNoPlano;
    }


    public void setDuracaoEmMinutos(int duracaoEmMinutos)
    {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica()
    {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota)
    {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia()
    {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }


    @Override
    public int compareTo(Titulo outroTitulo)
    {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString()
    {
        return  "(nome = " + nome +
                ", anoDeLancamento = " + anoDeLancamento +
                ", duracaoEmMinutos = " + duracaoEmMinutos + ")";
    }


}
