import java.util.Scanner;

public class CadastroDVD {
    public static Scanner teclado = new Scanner(System.in);

    public static void cadastrarDvd(Biblioteca biblioteca){
        System.out.println("Digite o titulo do DVD: ");
        String dvd = teclado.nextLine();

        System.out.println("Digite o nome do autor: ");
        String  autorDvd = teclado.nextLine();

        System.out.println("Digite o ano de publicação: ");
        int anoPubDvd = teclado.nextInt();

        System.out.println("Digite a duração do DVD: ");
        int duracaoDVD = teclado.nextInt();

        System.out.println("Digite o gênero do DVD: ");
        String generoDvd = teclado.nextLine();

        System.out.println("#### DVD CADASTRADO COM SUCESSO ####");
    }
}
