import java.util.Arrays;

public class OrdenaMeu {

  public static void printArray(int[]array){  
     for(int i = 0; i < array.length; i++){
        System.out.print(array[i]+ " ");
     }
  }	

 public static void main(String args[]) {
     int tamanho = args.length;
     int[] valores = new int[tamanho];
     for (int i = 0; i < tamanho; i++){
       valores[i] = Integer.parseInt(args[i]);
     
}

     Arrays.sort(valores);
     OrdenaMeu.printArray(valores);	   
 }
}



