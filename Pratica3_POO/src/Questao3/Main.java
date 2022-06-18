package Questao3;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String tipo = JOptionPane.showInputDialog("(1) ônibus \n(2) caminhão");
		String placa = JOptionPane.showInputDialog("Digite a placa do veiculo ");
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do veiculo "));
		
		switch(tipo) {
			case "1":
				int assentos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de assentos "));
				Onibus onibus = new Onibus(placa, ano, assentos);
				
				JOptionPane.showInternalMessageDialog(null, onibus.exibirDados(), placa, assentos);
				
				break;
			case "2":
				int eixos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de eixos que o caminhão possui "));
				Caminhao caminhao = new Caminhao(placa, ano, eixos);
				
				 caminhao.exibirDados();
				
				break;
			default:
				JOptionPane.showMessageDialog(null, "Resposta Invalída");
		
		}
		
	}

}