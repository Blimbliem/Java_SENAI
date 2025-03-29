import java.util.ArrayList;
import java.util.List;

public class TesteDispositivo {
    public static void main(String[] args) {
        List<ControleEnergia> controles = new ArrayList<>();
        Dispositivo televisao = new Dispositivo();
        Dispositivo celular = new Dispositivo();
        Dispositivo lampada = new Dispositivo();
        Dispositivo arCondicionado = new Dispositivo();

        controles.add(celular);
        controles.add(televisao);
        controles.add(lampada);
        controles.add(arCondicionado);

        for (ControleEnergia controle : controles) {
            controle.ligar();
        }
        for (ControleEnergia controle : controles){
            controle.desligar();
        }

    }
}