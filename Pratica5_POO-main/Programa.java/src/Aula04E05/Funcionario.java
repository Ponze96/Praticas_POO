package Aula04E05;

public class Funcionario {
	
	private String nome;
	private String departamento;
	private double salario;
	private String dataEntrada;
	private String RG;
	private boolean contratado;
	
	public Funcionario(String nome, String departamento, double salario, String dataEntrada, String RG) {
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.dataEntrada = dataEntrada;
		this.RG = RG;
		this.contratado = false;
	}

	public Funcionario(String nome, String departamento, double salario, String RG) {
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.RG = RG;
		this.contratado = false;
	}

	public Funcionario(String nome, String RG) {
		this.nome = nome;
		this.RG = RG;
		this.contratado = false;
	}

	public Funcionario(){
		this.contratado = false;
	}


	public void bonificar(Double bonus) {
		this.salario += bonus;
	}
	
	public void setContratado(boolean c) {
		this.contratado = c;
	}
	
	public String mostrarDados() {
		return this.nome +" "+ this.departamento +" "+  this.salario +" "+ this.dataEntrada +" "+ this.RG +" "+ this.contratado;
	}
	
	
}