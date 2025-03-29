import java.util.Scanner;

public class AoQuadrado{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite o valor que você deseja elevar ao quadrado: ");
	double EntradaUser = scanner.nextDouble();
	scanner.nextLine();

	//Efetuando o calculo
	double ElevaQ = EntradaUser * EntradaUser;
	
	System.out.println("O resultado é: " + ElevaQ); 

 }
}