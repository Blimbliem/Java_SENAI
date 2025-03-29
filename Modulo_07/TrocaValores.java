import java.util.Scanner;

public class TrocaValores{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);

	System.out.println("Digite um número: ");
	int A = scanner.nextInt();
	
	System.out.println("Digite outro número: ");
	int B = scanner.nextInt();

	
//invertendo os valores com uma variavel auxiliar
	int C; 
	C = A;
	A = B;
	B = C;
	

/*invertendo valores com as variaveis de entrada
a = 10
b= 20

b = a + b -> 30
a = b -a -> 20
b = b - a -> 10
*/
	System.out.println("Inversão 1: " + A);
	System.out.println("Inversão 2: " + B);

 }
}