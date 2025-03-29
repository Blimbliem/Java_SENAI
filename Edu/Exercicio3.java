public class Exercicio3{
	public static void main (String args []){
	int semana = Integer.parseInt(args[0]);

        switch(semana){
	case 1:
	 System.out.print("Domingo");
	 break;
        
	
	case 2:
	 System.out.print("Segunda-Feira");
	 break;
        
	
	case 3:
	 System.out.print("Terça-Feira");
	 break;
        
	
	case 4:
	 System.out.print("Quarta-Feira");
	 break;
        
	
	case 5:
	 System.out.print("Quinta-Feira");
	 break;
        
	
	case 6:
	 System.out.print("Sexta-Feira");
	 break;
        
	default:
	 System.out.print("Número inválido, deve ser entre 1 e 7");
	}

 }
}