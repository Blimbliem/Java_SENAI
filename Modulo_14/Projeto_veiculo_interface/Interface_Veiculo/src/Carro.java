public class Carro implements VeiculoTerrestre{

    boolean motorLigado;
    @Override
    public void buzinar() {
        System.out.println("Bibi!!!!");
    }

    @Override
    public void ligarMotor() {
        motorLigado = true;
        System.out.println("Motor ligado!");

    }

    @Override
    public void desligarMotor() {
         motorLigado = false;
        System.out.println("Motor desligado!");
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
        if (!motorLigado){
            System.out.println("Não é possivel acelerar com o carro desligado!!");
        }else{
            System.out.println("Acelerando");
        }
    }

    @Override
    public void frear() {
        System.out.println("Freiando!");
    }
}
