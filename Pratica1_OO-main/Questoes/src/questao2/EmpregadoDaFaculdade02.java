package questao2;

public class EmpregadoDaFaculdade02 {


	public String nome;
	public double salario;
	public int horasAula;
	
	EmpregadoDaFaculdade02(String nome, int salario, int horasAula) {
		this.nome = nome;
		this.salario = salario;
		this.horasAula = horasAula; 
	}

	double getBonus(){
		return 40 * horasAula;
	}
	
	String getNewSalario(){
		return "nome:" + this.nome + " com salário " + (this.salario + getBonus());
	}
	

}
