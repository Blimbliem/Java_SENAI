public class Matricula{
	public static void main(String []args){
	if (args.length > 0) {
		int idade = Integer.parseInt(args[0]);

	if(idade >= 18 ){
		System.out.print("Pode se matricular!");
	}else {
		System.out.print("Não pode se matricular.");
	}
 }
}
}