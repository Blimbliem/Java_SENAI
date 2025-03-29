import java.util.Scanner;
public class CadastroFuncionario {
    public static Scanner teclado = new Scanner(System.in);

    public static void cadastrarFuncionario(Biblioteca biblioteca) {
        System.out.println("Digite o nome do funcionario: ");
        String nome = teclado.nextLine();

        System.out.println("Digite o e-mail do funcionario: ");
        String email = teclado.next();

        System.out.println("Digite o telefone do funcionario: ");
        String telefone = teclado.next();

        System.out.println("Digite o endereço do funcionario: ");
        String endereco = teclado.nextLine();

        System.out.println("Digite o cargo do funcionario: ");
        String cargo = teclado.nextLine();

        Funcionario funcionario = new Funcionario(nome, email, telefone, endereco, cargo);
        biblioteca.adicionarUsuario(funcionario);

        System.out.println("#### FUNCIONARIO CADASTRADO COM SUCESSO ####");
    }
}
