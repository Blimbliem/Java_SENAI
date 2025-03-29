public class Exercicio2{
	public static void main(String [] args){
	double nota = Double.parseDouble(args[0]);

	
    if(nota <= 10 && nota >= 0){
	if(nota >= 6){
	 System.out.print("Parabéns, aprovado!");
	}else if(nota >=4 && nota <= 5.9){
	 System.out.print("Estude mais.Recuperação.");
	}else{
	 System.out.print("Reprovado!");
       }
     }else{
	System.out.print("Escreva uma nota entre 0 e 10");
    }	
}
}