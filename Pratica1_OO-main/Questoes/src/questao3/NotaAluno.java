package questao3;

public class NotaAluno {
	private int matricula;
	private String nome;
	private double notaAV1;
	private double notaAV2;
	private double notaAE;
	private String curso;
	private int periodo;
		
	

	public NotaAluno(int matricula, String nome, double notaAV1, double notaAV2, double notaAE, String curso,
			int periodo) {
		
		this.matricula = matricula;
		this.nome = nome;
		this.notaAV1 = notaAV1;
		this.notaAV2 = notaAV2;
		this.notaAE = notaAE;
		this.curso = curso;
		this.periodo = periodo;
	}

	public int getMatricula() {
		return matricula;
		
	}
	
	public void setMatricula(int matricula) {
		this.matricula =  matricula;
		
	}
	
	public String getNome() {
		return nome;
		
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public double alteraNotaAV1() {
		return notaAV1;
		
	}
	
	
	public void alteraNotaAV1 (double notaAV1) {
		this.notaAV1 = notaAV1;
		
	}
	
	public double alteraNotaAV2() {
		return notaAV2;
		
	}
	
	
	public void alteraNotaAV2(double notaAV2) {
		this.notaAV2 = notaAV2;	
	}		
		
	
	public boolean alteranotaAE(double notaAE) 
	{
        if (this.notaAE < 60) {
            return false;
 
        } 
        else {
            return true;            
        } 
	}
}

	
        
        
