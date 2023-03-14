package Financeira;

import java.util.Scanner;

public class TesteFinanceira {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CalculaInvestimento testeInvest = new CalculaInvestimento();
		
		System.out.println("Informe o investimento inicial:");
		testeInvest.setInvestInicial(sc.nextDouble());
		System.out.println("Informe a taxa ao mes(ex.: 0.02):");
		testeInvest.setTaxaRendimento(sc.nextDouble());
		System.out.println("Informe o numero de meses:");
		testeInvest.setnMeses(sc.nextInt());
		
		System.out.println(testeInvest.CalcRendimento());
		
		sc.close();
	}
}
