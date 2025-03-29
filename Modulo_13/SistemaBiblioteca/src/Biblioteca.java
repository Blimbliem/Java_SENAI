import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    //atributos
    private List<Item> itens;
    private List<Usuario> usuarios;

    public Biblioteca(List<Item> itens, List<Usuario> usuarios) {
        this.itens = itens;
        this.usuarios = usuarios;
    }

    // é inicializado sem parâmetros
    public Biblioteca() {
        this.itens = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    //método para adicionar item
    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    //método para adicionar usuario
    public void adicionarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public Item buscarItem(String titulo) {
        for (Item item : this.itens) {
            if (item.getTitulo().equalsIgnoreCase(titulo)) {
                return item;
            }
        }
        return null;

    }



    public Item buscarItem(int ano) {
        for (Item item : this.itens) {
            if (item.getAno() == ano) {
                return item;
            }
        }
        return null;

    }
    public Item buscarItem(String autor,int ano) {
        for (Item item : this.itens) {
            if (item.getAno() == ano && item.getAutor().equalsIgnoreCase(autor)) {
                return item;
            }
        }
        return null;

    }

}