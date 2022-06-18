package Aula04E05;

public class Main {

	public static void main(String[] args) {
		/*Pessoa func1 = new Pessoa ("Joao", 192, 70);
		Pessoa func2 = new Pessoa("Gerald", 184, 80);
		Pessoa func3 = new Pessoa("Clayton", 190, 85);
		
		Pessoa[] pessoas = new Pessoa[10];
		for(int i=0; i<10; i++) {
			pessoas[i] = new Pessoa ("Pedro" + i,50, 1.70);
		}*/
		
		
		
		Funcionario func1 = new Funcionario("Carlos", "Administrativo", 0 , "Março", "02255859887452");
		Empresa[] vetorEmpresa = new Empresa[5];
		
		for(int i=0; i < vetorEmpresa.length ; i++){
			vetorEmpresa[i] = new Empresa("Pedro", "xxx", func1);
		
	}

		Empresa Store = new Empresa("Drope", "Digital");
		
		Funcionario Clayton = new Funcionario("ClaytonWagner", "Gerencia", 12000, "Fevereiro", "859");
		Funcionario Carlos = new Funcionario("Carlos", "Compras", 3000, "Março", "800");
		Funcionario Wil = new Funcionario("Wil", "TI", 4000, "Novembro", "85963");
		
		Store.contratar(Clayton);
		Store.contratar(Carlos);
		Store.contratar(Wil);
		
		System.out.println("Total de funcionario pos contratar: "+Store.numDeFunc());
		
		Store.demitir(Carlos);
		Store.demitir(Wil);
		
		System.out.println("Total de funcionario depois de demitir: "+Store.numDeFunc());
	
}
	
}