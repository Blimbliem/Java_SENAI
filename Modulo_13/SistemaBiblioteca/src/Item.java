public class Item {
    //atributos
    private String titulo, autor;
    private int ano;
    private boolean emprestado;

    //construtor dos atributos
    public Item(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.emprestado = false;
    }
    //métodos de encapsulamento - getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public boolean isEmprestado() {
        return emprestado;
    }


    //métodos de encapsulamento - setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }




    //métodos dos atributos
    public void emprestar(){
        this.emprestado = true;
    }
    public void devolver(){
        this.emprestado = false;
    }

    public void mostrarDetalhes(){
        System.out.println("Título do ítem: " + titulo);
        System.out.println("Nome do autor: " + autor);
        System.out.println("Ano de lançamento: " + ano);
        System.out.println("Emprestado: " + emprestado);
    }
}
