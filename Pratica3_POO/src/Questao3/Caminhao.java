package Questao3;
import javax.swing.JOptionPane;

public class Caminhao extends Veiculo2 {
	private int eixos;

	Caminhao(String placa, int ano, int eixos){
		super(placa, ano);
		this.eixos = eixos;
	}
	
	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
	public void exibirDados() {
		JOptionPane.showMessageDialog(null, "Dados do veiculo: \nPlaca: "+ getPlaca() + "\nAno: "+ getAno());
	}


}