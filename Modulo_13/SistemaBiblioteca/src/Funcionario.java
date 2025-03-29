public class Funcionario extends Usuario {
    private String cargo;
    private String endereco;

    public Funcionario(String nome, String email, String telefone, String cargo, String endereco) {
        super(nome, email, telefone);
        this.cargo = cargo;
        this.endereco= endereco;
    }

    //getters
    public String getCargo() {
        return cargo;
    }

    public String getEndereco(){return endereco;}

    //setters
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        System.out.println("Cargo: " + cargo);
    }
}
