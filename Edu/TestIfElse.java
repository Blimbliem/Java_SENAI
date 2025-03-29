public class TestIfElse {
    public static void main(String[] args) {
        // Verifica se foi passado algum argumento
        if (args.length > 0) {
            // Converte o primeiro argumento para inteiro
            int x = Integer.parseInt(args[0]);


// o código acima é a correção desse código: int x = args;
           
	    // Verifica se x é menor que 20
            if (x < 20) {
                System.out.print("Fluxo se verdadeiro.");
            }else {
                System.out.print("Fluxo se falso.");
          }  
        } else {
            // Caso nenhum argumento seja passado
            System.out.println("Por favor, forneça um argumento.");
        }
    }
}
