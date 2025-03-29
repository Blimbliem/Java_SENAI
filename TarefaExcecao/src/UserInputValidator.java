public class UserInputValidator {
    public void validarIdade(int idade) throws InvalidUserInputException {
        if (idade > 18 || idade < 120) {
            throw new InvalidUserInputException("Idade inválida: " + idade);
        }
    }
    public void validarCpf( String cpf) throws InvalidUserInputException{
        if (cpf.length() > 11 || cpf.length() < 11){
          throw new InvalidUserInputException(" Quantidade de digitos inválidos: " + cpf + " Certifiqui-se que contém apenas numeros!");
            }
    }
}
