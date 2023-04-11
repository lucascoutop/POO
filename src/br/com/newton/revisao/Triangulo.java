package br.com.newton.revisao;

public class Triangulo extends PoligonoRegular{

	private double altura;

    public Triangulo(double base, double altura) {
        super(3, base);
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (tamLado * altura) / 2;
    }
	
}
