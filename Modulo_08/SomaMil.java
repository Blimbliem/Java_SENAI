public class SomaMil{
	public static void main(String [] args){
	
	int soma = 0; // temos que iniciar a variavel fora do while
	int x = 1; // temos que iniciar a variavel contador fora do while
	
	while(x <= 100 && soma < 1000){ // aqui eu digo que o enquanto o x for meno ou igual a 100 e o resultado da soma menor que 1000
	 if(x %2 == 0){ //o programa devera realizar o while se o numero dentro da variavel x o numero for par
	 System.out.println(soma); // printa o resultado
	  soma = soma + x;  //armazena na variavel soma o resultado de cada calculo enquanto o laço é realizado
	}
	x++; // itera sobre a variavel x -> aqui é onde o while é realizado.
	}

}
}