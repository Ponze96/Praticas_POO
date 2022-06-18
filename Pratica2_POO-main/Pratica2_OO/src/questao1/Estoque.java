package questao1;
import java.util.Scanner;
public class Estoque {
	
             private String nome;
             private int qtdAtual;
             private int qtdMinima;
			            
	
			
			public Estoque(String nome, int qtdAtual, int qtdMinima) {
				this.nome = nome;
				this.qtdAtual = qtdAtual;
				this.qtdMinima = qtdMinima;
			}	
				
		
			
			public String getNome() {
				return nome;
			}


			public void setNome(String nome) {
				this.nome = nome;
			}



			public int getQtdAtual() {
				return qtdAtual;
			}


			public void setQtdAtual(int qtdAtual) {
				this.qtdAtual = qtdAtual;
			}


			public int getQtdMinima() {
				return qtdMinima;
			}


			public void setQtdMinima(int qtdMinima) {
				this.qtdMinima = qtdMinima;
			}

			public void darBaixaEstoque(int estoquebaixa){
				this.qtdAtual = this.qtdAtual - estoquebaixa;
			
			}
						
			public String mostra() {
				
				return "\n \nNome produto:" + this.nome+ "\nQuantidade atual:"
						+this.qtdAtual+ "\nQuantidade minima " +this.qtdMinima+ "\n \n";
			}	
									
			
			public boolean precisaRepor() {
				if (this.qtdAtual <= this.qtdMinima)
					return true;
				else
					return false;				
			}
				
				
				
			}             
          
          


