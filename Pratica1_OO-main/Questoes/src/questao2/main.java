package questao2;

public class main {

	public static void main(String[] args) {
		
		EmpregadoDaFaculdade02 professor = new EmpregadoDaFaculdade02(" Gerald ", 1000, 2);
		
		var bonus = professor.getBonus();
		var salario = professor.getNewSalario();
		
		System.out.println("Bonus de "+ bonus + " e seu salário será " + salario);
	}

}