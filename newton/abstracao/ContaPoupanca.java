package br.com.newton.abstracao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta{

	public void imprimeExtrato() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println("Extrato da conta poupança em " + formatter.format(date));
        System.out.println("Saldo atual: R$" + getSaldo());
    }
	
}
