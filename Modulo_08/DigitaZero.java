import java.util.Scanner;
public class DigitaZero{
	public static void main(String [] args){
	 Scanner scanner = new Scanner(System.in);
	

	int Resultado = 0;
	int UserNum = 0;
	
	do{
	System.out.println("Digite algum numero para somar: "); // aqui solicito a entrada do usuario
	 UserNum = scanner.nextInt(); // aqui estou permitindo que o numero digitado pelo usuario acesse a variavel UserNum
	  scanner.nextLine();
	    Resultado = Resultado + UserNum; // aqui estou realizando o calculo em cima da variavel Resultado
	}while(UserNum != 0);// aqui declaro a condição de que o programa deve realizar esse calculo até ser digitado o numero zero
	System.out.println(Resultado);
}
}