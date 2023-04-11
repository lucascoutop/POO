package br.com.newton.revisao;

public class Main {

	public static void main(String[] args) {
        PoligonoRegular triangulo = new Triangulo(3.0, 4.0);
        System.out.println("Área do triângulo: " + triangulo.calcularArea());

        PoligonoRegular quadrado = new Quadrado(5.0);
        System.out.println("Área do quadrado: " + quadrado.calcularArea());
    }
	
}
