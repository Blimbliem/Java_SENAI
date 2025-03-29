public class DVD extends Item{
    private int duracao;
    private String genero;

    public DVD(String titulo, String autor, int ano, int duracao, String genero) {
        super(titulo, autor, ano);
        this.duracao = duracao;
        this.genero = genero;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Duração do DVD: " + duracao);
        System.out.println("Gênero do DVD: " + genero);
    }
}

