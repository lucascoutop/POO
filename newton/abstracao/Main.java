package br.com.newton.abstracao;

public class Main extends Conta{

	public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca();
        cp.setSaldo(2121);
        cp.imprimeExtrato();
    }
	
}
