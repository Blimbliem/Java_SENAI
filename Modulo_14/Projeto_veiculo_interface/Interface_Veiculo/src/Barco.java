public class Barco implements Veiculo,VeiculoAquatico {

    boolean motorLigado;
    @Override
    public void ligarMotor() {
        motorLigado = true;
        System.out.println("Motor ligado!");
    }

    @Override
    public void desligarMotor() {
        motorLigado = false;
        System.out.println("Motor desligado");
    }

    @Override
    public void virarDireita() {
        System.out.println("Você está virando para direita");

    }

    @Override
    public void virarEsquerda() {
        System.out.println("Você está virando para esquerda");
    }

    @Override
    public void acelerar() {
        if (motorLigado){
            System.out.println("Acelerando o barco!");
        }else{
            System.out.println("Não é possivel acelerar com o motor do barco desligado!");
        }

    }

    @Override
    public void frear() {
        System.out.println("Freiando!");

    }

    @Override
    public void ancorar() {
        if (!motorLigado) {
            System.out.println("Ancorando!");
        }
    }
}
