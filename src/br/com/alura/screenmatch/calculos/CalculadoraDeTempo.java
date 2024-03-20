package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo
{
    private int tempoTotal;


    public int getTempoTotal()
    {
        return tempoTotal;
    }

// public void inclui(Filme novoFilme){
//     tempoTotal += novoFilme.getDuaracaoEmMinutos();
// }

//   public void inclui(Series novaSerie){
//       tempoTotal += novaSerie.getDuaracaoEmMinutos();
//   }

    public void inclui(Titulo novoTitulo)
    {
        this.tempoTotal += novoTitulo.getDuracaoEmMinutos();
    }

}
