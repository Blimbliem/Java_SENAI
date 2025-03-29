public class TestSwitch{
	public static void main (String args[]){
	  char conceito = args[0].charAt(0);

	switch(conceito){
	  case 'A':
		System.out.println("Excelente!");
	 	break;
	  case 'B':
	  case 'C':
		System.out.print("Bom");
		break;
	  case 'F':
		System.out.println("Tente novamente");
		break;
	  default:
		System.out.println("Conceito inválido");


}
}
}