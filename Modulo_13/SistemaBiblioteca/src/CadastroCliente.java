import java.util.Scanner;
public class CadastroCliente {
    public static Scanner teclado = new Scanner(System.in);

    public static void cadastrarCliente(Biblioteca biblioteca){
        System.out.println("Digite o nome do cliente: ");
        String nome = teclado.nextLine();

        System.out.println("Digite o e-mail do cliente: ");
        String  email = teclado.next();

        System.out.println("Digite o telefone do cliente: ");
        String telefone = teclado.next();

        System.out.println("Digite o endereço do cliente: ");
        String endereco = teclado.nextLine();

        Cliente cliente = new Cliente (nome ,email,telefone,endereco);
        biblioteca.adicionarUsuario(cliente);

        System.out.println("#### CLIENTE CADASTRADO COM SUCESSO ####");
    }
}
