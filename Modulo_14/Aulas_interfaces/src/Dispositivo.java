public class Dispositivo implements ControleEnergia, ControleRede, ControleArmazenamento {

    @Override
    public void ligar(){
        System.out.println("Dispositivo ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Dispositivo desligado");

    }

    @Override
    public void lerDados() {
        System.out.println("Lendo dados do dispositivo.");
    }

    @Override
    public void escreverDados(String dados) {
        System.out.println("Escrevendo dados no dispositivo: " + dados);
    }

    @Override
    public void conectaRede() {
        System.out.println("Dispositivo conectado à rede.");
    }

    @Override
    public void desconectaRede() {
        System.out.println("Dispositivo desconectado da rede");
    }
}
