package br.com.newton.ex2;

public class Main {

	ContaCorrente cc = new ContaCorrente();
	cc.depositar(1200.20);
	cc.sacar(300);
	
	ContaPoupanca cp = ContaPoupanca();
	cp.depositar(500.50);
	cp.sacar(25);
	
	GeradorExtratos gerador = GeradorExtratos();
	gerador.deradorConta(cc);
	gerador.geradorConta(cp);
}
