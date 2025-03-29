public class TestArray{
	public static void printArray(int[] array){
		for (int i = 0; i < array.length; i++){
			System.out.println(array[i]+" ");
		
  } 
	System.out.println("\n");
 }

	public static void main (String [] args){
		int [] meuArray = new int []{3,2,1,6,4,2};
		TestArray.printArray(meuArray);

		int [] seuArray = new int [] {4,5,6,7,8};
		TestArray.printArray(seuArray);
 }
}