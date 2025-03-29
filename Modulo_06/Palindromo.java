import java.util.Scanner;

public class Palindromo{
	public static void main (String []args){
	 Scanner scanner = new Scanner(System.in);
	  
	 System.out.print("Verifique se a palavra digitada é um palpindromo: ");
	 String palavra = scanner.next();
	 String inversa = "";
	  
	  for (int i = palavra.length() - 1; i >= 0; i--){
		inversa += palavra.charAt(i);
	}
	
	if (palavra.equals(inversa)){
		System.out.println("Essa palavra eh um palindromo!");
	}else {
		System.out.println("Essa palavra nao eh um palindromo!");
	}
	
	scanner.close();

 }
}