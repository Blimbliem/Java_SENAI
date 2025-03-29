import java.util.ArrayList;
import java.util.List;
//sempre importar a biblioteca acima quando for usar listas

public class Cliente extends Usuario {
    //declaração dos atributos
    private String endereco;
    private List<Item> itensEmprestados;

    //contrução dos atributos
    public Cliente(String nome, String email, String telefone, String endereco) {
        super(nome, email, telefone);
        this.endereco = endereco;
        //inicializando uma lista vazia
        this.itensEmprestados = new ArrayList<>();
    }

    //getters
    public String getEndereco() {
        return endereco;
    }

    //setters
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //métodos
    public void emprestarItem(Item item){
        if (item.isEmprestado()){
            System.out.println("Item já está emprestado");
            return;
        }
        System.out.println("Livro disponivel!");
        item.emprestar();
        this.itensEmprestados.add(item);
    }

    public void devolverItem(Item item) {
        if (item.isEmprestado()) {
            this.itensEmprestados.remove(item);
            item.devolver();
        }
    }
        @Override
        public void mostrarInformacoes() {
            super.mostrarInformacoes();
            System.out.println("Endereço: " + endereco);

            // laço for para mostrar os itens que o cliente pegou
            for (Item item : itensEmprestados) {
                item.mostrarDetalhes();
            }
        }
}
