public class ArrayLoopEach{
	public static void main(String [] args){

		int[] idades = new int [5];
	idades[0] = 10;
	idades[1] = 13; 
	idades[2] = 20;
	idades[3] = 6;
	idades[4] = 4;

	for (int idade : idades){
  		System.out.println(idade);
  }
 }
}