public class Revista extends Item{
    private int numeroDeEdicao;
    private String mesDePublicacao;

    //construtor
    public Revista(String titulo, String autor, int ano, int numeroDeEdicao, String mesDePublicacao) {
        super(titulo, autor, ano);
        this.numeroDeEdicao = numeroDeEdicao;
        this.mesDePublicacao = mesDePublicacao;
    }
    // getters
    public int getNumeroDeEdicao() {
        return numeroDeEdicao;
    }

    public String getMesDePublicacao() {
        return mesDePublicacao;
    }

    //setters
    public void setNumeroDeEdicao(int numeroDeEdicao) {
        this.numeroDeEdicao = numeroDeEdicao;
    }

    public void setMesDePublicacao(String mesDePublicacao) {
        this.mesDePublicacao = mesDePublicacao;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Numero da Edição: " + numeroDeEdicao);
        System.out.println("Mês de publicação: " + mesDePublicacao);
    }
}
