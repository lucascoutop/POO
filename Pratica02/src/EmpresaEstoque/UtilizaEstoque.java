package EmpresaEstoque;

import java.util.Scanner;

public class UtilizaEstoque {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		
//		Estoque testeEstoque = new Estoque();
//		
//		System.out.println("Informe o nome do produto:");
//		testeEstoque.setNome(sc.next());
//		System.out.println("Informe a quantidade atual do produto:");
//		testeEstoque.setQtdAtual(sc.nextInt());
//		System.out.println("Informe a quantidade minima do produto:");
//		testeEstoque.setQtdMinima(sc.nextInt());
		
		Estoque testaEstoque = new Estoque("lucas", 20, 5);
		
		System.out.println(testaEstoque.mostra());
		
		System.out.println("Quantidade para dar baixa:");
		testaEstoque.darBaixa(sc.nextInt());
		
		if(testaEstoque.precisaRepor()) {
			System.out.println("Precisa repor.");
		}else {
			System.out.println("Não precisa repor.");
		}
		
		sc.close();
		
	}
}
