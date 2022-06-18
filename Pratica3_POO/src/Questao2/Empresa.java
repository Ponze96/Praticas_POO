package Questao2;

public class Empresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FPadrao f1 = new FPadrao (123, "Joao ", 1000);
		System.out.println(f1.toString());
		
		FComissionado f2 = new FComissionado(14, "Maria ", 1000, 500, 10);
		System.out.println(f2.toString());
	}

}
