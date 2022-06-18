package Questao1;

public class VIP extends Ingresso {
	
private double valorAdicional;
	
	public VIP (double valor, double valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
		
	}
	
	public String valorVip() {
		return "Ingresso VIP " + getIngresso()+this.valorAdicional;
	}
}