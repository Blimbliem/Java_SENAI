public class PulaCinco{
	public static void main(String [] args){
	
	int i = 0; // inicia a variavel
	
	while(i <50){ // enquanto o contador for menor que 50 ele deve:
	 i++; // iterar 
	  if (i %5 == 0){ // se o número não for multiplo de 5 ele deve pular
	   continue;
	  }else{
	    System.out.println(i);} // se não for, deve ser printado.
	
	}
}
}