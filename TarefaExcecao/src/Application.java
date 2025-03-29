public class Application {
    public static void main(String[] args) {
        UserInputValidator userInputValidator = new UserInputValidator();
        try {
            userInputValidator.validarIdade(-5); // Idade inválida
        } catch (InvalidUserInputException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        UserInputValidator userInputValidator1 = new UserInputValidator();
        try{
            userInputValidator1.validarCpf("51915194857");
        }catch (InvalidUserInputException e){
            System.out.println("Exceção capturada:" + e.getMessage());
        }

        DatabaseConnector databaseConnector = new DatabaseConnector();
        try {
            databaseConnector.connect(""); // String de conexão inválida
        } catch (DatabaseConnectionException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
