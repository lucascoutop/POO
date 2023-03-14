package Financeira;

public class CalculaInvestimento {
	double investInicial;
	double taxaRendimento;
	int nMeses;
	
	public CalculaInvestimento() {
		
	}
	
	public CalculaInvestimento(double investInicial, double taxaRendimento, int nMeses) {
		this.investInicial = investInicial;
		this.taxaRendimento = taxaRendimento;
		this.nMeses = nMeses;
	}
	
	public double CalcRendimento() {
		return (this.investInicial * this.taxaRendimento * this.nMeses)+ this.investInicial; 
	}



	public double getInvestInicial() {
		return investInicial;
	}



	public void setInvestInicial(double investInicial) {
		this.investInicial = investInicial;
	}



	public double getTaxaRendimento() {
		return taxaRendimento;
	}



	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}



	public int getnMeses() {
		return nMeses;
	}



	public void setnMeses(int nMeses) {
		this.nMeses = nMeses;
	}
		
	
}
