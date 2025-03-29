public class Livro extends Item {
    private int numeroDePaginas;
    private String genero;

    //construtor

    public Livro(String titulo, String autor, int ano, int numeroDePaginas, String genero) {
        super(titulo, autor, ano);
        this.numeroDePaginas = numeroDePaginas;
        this.genero = genero;
    }

    // getter
    public String getGenero() {
        return genero;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    // setter
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Numero de páginas: " + numeroDePaginas);
        System.out.println("Gênero: " + genero);
    }
}
