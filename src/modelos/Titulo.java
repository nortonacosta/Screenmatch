package modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean inclusoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;



    public String getNome() {
        return this.nome;
    }

    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }

    public boolean getInclusoNoPlano() {
        return this.inclusoNoPlano;
    }

    public int getTotalDeAvaliacoes(){
        return this.totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setInclusoNoPlano(boolean inclusoNoPlano){
        this.inclusoNoPlano = inclusoNoPlano;
    }


    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("================ Ficha Técnica ================");
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Incluso no plano: " + inclusoNoPlano);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Total de avaliações: " + getTotalDeAvaliacoes());;
        System.out.println("Soma das avaliações: " + somaDasAvaliacoes);
        System.out.println("Média: " + pegaMedia());
        System.out.println("================================================");
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}
