import java.util.Arrays;

public class Ordena{
	public static void main(String [] args){
	int [] valores = new int [args.length];

	for (int i = 0; i < args.length; i++){
	valores[i] = Integer.parseInt(args[i]);
 } 

	Arrays.sort(valores);
	for (int numeros : valores){
		System.out.print(numeros + " ");
  }
 }
}