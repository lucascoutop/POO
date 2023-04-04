package br.com.newton.ex2;

public class Conta {
	
	private double saldo;
	
	
	
	public double getSaldo() {
		return saldo;
	}

	public void setValor(double saldo) {
		this.saldo = saldo;
	}

	public void deposita(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		if (saldo >= valor) {
            saldo -= valor;
        }
	}
	
}
