import java.util.Scanner;

public class CadastroLivro {
    public static Scanner teclado = new Scanner(System.in);

    public static void cadastrarLivro(Biblioteca biblioteca){
        System.out.println("Digite o titulo do livro: ");
        String titulo = teclado.nextLine();

        System.out.println("Digite o nome do autor: ");
        String  autorLivro = teclado.nextLine();

        System.out.println("Digite o ano de publicação: ");
        int anoPubLivro = teclado.nextInt();

        System.out.println("Digite o numero de páginas do livro: ");
        int numerpDePaginas = teclado.nextInt();

        System.out.println("Digite o gênero do livro: ");
        String generoLivro = teclado.nextLine();

        Livro livro = new Livro (titulo, autorLivro,anoPubLivro, numerpDePaginas,generoLivro);
        biblioteca.adicionarItem(livro);

        System.out.println("#### LIVRO CADASTRADO COM SUCESSO ####");
    }


}
