public class MatrizLaco{
	public static void main(String [] args){
 
	int[][] matriz ={
		{1,2,3,4,5},
		{5,6,7,8},
		{9,10,11,12}
	};

	for (int i = 0; i <matriz.length; i++){
	    for(int j = 0; j < matriz[i].length; j++) {
		System.out.println("Elemento em [" + i + "][" + j + "]: " + matriz [i][j]);
		}
	}

 }
}