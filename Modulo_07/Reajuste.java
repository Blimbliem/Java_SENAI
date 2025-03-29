import java.util.Scanner;

public class Reajuste{
	public static void main(String [] args){
	Scanner scanner = new Scanner(System.in);

	System.out.println("Digite seu salario mensal!");
	double Salario = scanner.nextDouble();
	scanner.nextLine();

	System.out.println("Digite o valor percentual do reajuste: ");
	double PerReajuste = scanner.nextDouble();
	scanner.nextLine();
	
	//calculando reajuste
	
	double CalcReajuste = Salario * (1 + PerReajuste / 100);
	System.out.println("Seu novo salario é: " + CalcReajuste);


}
}