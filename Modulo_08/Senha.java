import java.util.Scanner;

public class Senha{
	
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	System.out.println("Digite sua senha!");
	String senha = scanner.next();
	
	boolean temNumero = false;
	boolean temMaiuscula = false;
	boolean temMinuscula = false;
	boolean temTamanho = senha.length() >=8;
	
 	//verificando caracteres
	
	for (int i = 0; i < senha.length(); i++){
	char verifica = senha.charAt(i);
	
	if (Character.isDigit(verifica)){
	 temNumero = true;	
	}
	if (Character.isUpperCase(verifica)){
	 temMaiuscula = true;
	}
	if (Character.isLowerCase(verifica)){
	 temMinuscula = true;
	}
       }
	
	//avaliando força da senha
	
	if (temTamanho && temNumero && temMaiuscula && temMinuscula){
		System.out.println("Senha forte!");
	}
	else if (temTamanho && temMaiuscula && temMinuscula){
		System.out.println("Senha média!");
	}
	else if (temTamanho || temMinuscula){
		System.out.println("Senha média baixa!");
	}else{
		System.out.println("Senha baixa!");
	}

	
	scanner.close();
 }
}