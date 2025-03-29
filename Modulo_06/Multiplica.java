import java.util.Scanner;
public class Multiplica{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);

	System.out.println("DIGITE O MULTIPLICADOR");
	int Multiplicador = scanner.nextInt();
	scanner.nextLine();
	
	System.out.println("DIGITE O MULTIPLICANDO");
	int Multiplicando = scanner.nextInt();
	scanner.nextLine();

	
	int produto = 0;	
	for( int i = 0; i < Multiplicador; i++){
	   produto += Multiplicando;
	} 
	
	System.out.println("O resultado: " + produto);
}
}