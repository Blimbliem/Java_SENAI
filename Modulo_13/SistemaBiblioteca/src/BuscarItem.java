import java.util.Scanner;

public class BuscarItem {
    public static Scanner teclado = new Scanner(System.in);

    public static void buscarItem(Biblioteca biblioteca){
        System.out.println("#### BUSCA POR ITEM ####");
        System.out.println("Digite o titulo item: ");
        String titulo = teclado.nextLine();

        Item item = biblioteca.buscarItem(titulo);
        if(item != null) item.mostrarDetalhes();
        else System.out.println("O item procurado não existe.");

        System.out.println("#### FIM DA BUSCA POR ITEM ####");
    }
}
