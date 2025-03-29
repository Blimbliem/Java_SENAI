public class DatabaseConnector {

    public void connect(String stringConexao){
        if(stringConexao == null || stringConexao.isEmpty()){
            throw new DatabaseConnectionException("String de conexão inválida");

        }
        //lógica de conexão com o banco de dados
    }
}
