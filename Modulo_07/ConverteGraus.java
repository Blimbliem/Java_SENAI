import javax.swing.*;

public class ConverteGraus {
    public static void main(String[] args) {
        Object[] opcoes = {"Celsius->Fahrenheit ", "Fahrenheit->Celsius", "Cancelar"};
        int n = JOptionPane.showOptionDialog(
                null,
                "Você deseja continuar?",
                "Confirmação",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,        // sem ícone
                opcoes,      // Título dos botões
                opcoes[0]    // Título do botão default
        );

        switch (n) {
            case 0: // Sim
                String tempC = JOptionPane.showInputDialog("Digite a temperatura");
		double tempConvertida = (9 * Double.parseDouble(tempC)+160)/5;
		JOptionPane.showMessageDialog(null,"A temperatura em graus Farenheit é: "+ tempConvertida);
                break;
            case 1: // OK  
		String tempF = JOptionPane.showInputDialog("Digite a temperatura");
		double tempConvertidaf = Math.round(((Double.parseDouble(tempF)-32)*5)/9);
		JOptionPane.showMessageDialog(null,"A temperatura em graus Celsius é: "+ tempConvertidaf);
                break;
            case 2: // Cancelar
                JOptionPane.showMessageDialog(null, "Até a próxima!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nenhuma opção selecionada.");
                break;
        }
    }
}
