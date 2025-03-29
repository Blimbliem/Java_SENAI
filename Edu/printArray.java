 public static void PrintArray(int[] array) {
        System.out.println();
        for(int i = 0; i < array.length; i++) {
           System.out.println(array[i] + " -> " + i);
        }
   }

   public static void printArray(double[] array) {
        System.out.println();
        for(int i = 0; i < array.length; i++) {
           System.out.println(array[i] + " ");
        }
   }

   public static void main(String[] args) {
      int[] meuArray = new int[]{3, 1, 2, 6, 4, 2};
      TestArray.printArray(meuArray);

      int[] idades = new int[]{10, 12};
      TestArray.printArray(idades);

      int[] pontos = new int[]{1025, 3142, 12, 334};
      TestArray.printArray(pontos);
 
      double[] salarios = new double[]{100, 332.33};
      TestArray.printArray(salarios);
   }
}