public class Exercicio1{
	public static void main (String []args){
	if(args.length > 0){
	double valorCompra = Double.parseDouble(args[0]);
	
	if (valorCompra > 100){
	System.out.print("O valor com desconto é: " + (valorCompra- (valorCompra * 0.1)));	
	}else {
	System.out.print("O valor da compra não está disponivel para o desconto, portanto o valor é: " + valorCompra);
	}
  }
 }
}