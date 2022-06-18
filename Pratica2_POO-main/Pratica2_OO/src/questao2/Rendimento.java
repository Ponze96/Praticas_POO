package questao2;
import java.util.Scanner;
public class Rendimento {
	private long rendimento;
	private long InvestimentoInicial;
	private long TaxaRendimento;
	private long NumeroMeses;
	
	
	public Rendimento(long rendimento, long investimentoInicial, long taxaRendimento, long numeroMeses) {
		super();
		this.rendimento = rendimento;
		InvestimentoInicial = investimentoInicial;
		TaxaRendimento = taxaRendimento;
		NumeroMeses = numeroMeses;
		
		}

	
		public long getRendimento() {
			return rendimento;
		}
	
		public void setRendimento(long rendimento) {
			this.rendimento = rendimento;
		}
		
		public long getInvestimenoInicial() {
			return InvestimentoInicial;
			
		}
		
		public void setinvestimentoInicial(long InvestimentoInicial){
			this.InvestimentoInicial = InvestimentoInicial;
		}	
				
		public long getTaxaRendimeto() {
			return TaxaRendimento;
		}
		
		public void setTaxaRendimento(long TaxaRendimento) {
			this.TaxaRendimento = TaxaRendimento;
		}
		
		public long getnumeroMeses() {
			return NumeroMeses;
		}
		
		public void setnumeroMeses(long numeroMeses) {
			this.NumeroMeses = numeroMeses;
			
		}
				
		
		public long calculaSaldo() {
			return getRendimento ();
			
		}
}

