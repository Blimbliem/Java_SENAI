import org.w3c.dom.ls.LSOutput;

public class Principal {
    public static void main(String[] args) {
        VeiculoAquatico meuBarco = new Barco();
        VeiculoTerrestre meuCarro = new Carro();

        System.out.println("Testando Barco: ");
        meuBarco.ligarMotor();
        meuBarco.acelerar();
        meuBarco.virarDireita();
        meuBarco.desligarMotor();
        meuBarco.ancorar();


        System.out.println("Testando Carro:");
        meuCarro.ligarMotor();
        meuCarro.acelerar();
        meuCarro.buzinar();
        meuCarro.frear();
        meuCarro.virarEsquerda();
        meuCarro.frear();
        meuCarro.desligarMotor();
    }
}