import java.util.Scanner;

public class ContaVogal{
	public static void main(String [] args){
	 Scanner ler = new Scanner(System.in);
	   
	System.out.println("Informe uma frase!");
	String texto = ler.nextLine();
	
	int contaVogais = 0; // variavel para contar vogais 
	
	// acessando cada letra do texto
	for (int i = 0; i < texto.length(); i++){
	char letra = Character.toLowerCase(texto.charAt(i)); // converte para uma String minuscula
	
	if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
	 contaVogais++;
	}
       }

	System.out.println("Numero de vogais: " + contaVogais);
	ler.close();
 }
}