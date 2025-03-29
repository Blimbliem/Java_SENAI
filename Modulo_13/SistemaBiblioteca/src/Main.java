import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        Biblioteca bibliotecaSenai = new Biblioteca();

        do {
            System.out.println("Digite uma opção");
            System.out.println("1 - Cadatrar cliente");
            System.out.println("2 - Cadastrar funcionario");
            System.out.println("3 - Cadastrar Livro");
            System.out.println("4 - Cadastrar Revista");
            System.out.println("5 - Cadastrar DVD");
            System.out.println("6 - Buscar item");
            System.out.println("7 - Sair");
            opcao = entrada.nextInt();


            switch (opcao) {
                case 1:
                    CadastroCliente.cadastrarCliente(bibliotecaSenai);
                    break;
                case 2:
                    CadastroFuncionario.cadastrarFuncionario(bibliotecaSenai);
                    break;
                case 3:
                    CadastroLivro.cadastrarLivro(bibliotecaSenai);
                    break;
                case 4:
                    CadastroRevista.cadastrarRevista(bibliotecaSenai);
                    break;
                case 5:
                    CadastroDVD.cadastrarDvd(bibliotecaSenai);
                    break;

                case 6:
                    BuscarItem.buscarItem(bibliotecaSenai);
                    break;
                case 7:
                    break;
            }
        }while (opcao != 7);
    }
}