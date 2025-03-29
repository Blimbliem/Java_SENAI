import java.util.Scanner;

public class CadastroRevista {
    public static Scanner teclado = new Scanner(System.in);

    public static void cadastrarRevista(Biblioteca biblioteca){
        System.out.println("Digite o titulo do revista: ");
        String revista = teclado.nextLine();

        System.out.println("Digite o nome do autor: ");
        String  autor = teclado.nextLine();

        System.out.println("Digite o ano de publicação: ");
        int ano = teclado.nextInt();

        System.out.println("Digite o numero da edição: ");
        int numeroDeEdicao = teclado.nextInt();

        System.out.println("Digite o mês de publicação: ");
        String mesDePublicacao = teclado.next();

        System.out.println("#### REVISTA CADASTRADO COM SUCESSO ####");
    }
}
