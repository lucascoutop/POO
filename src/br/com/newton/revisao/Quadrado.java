package br.com.newton.revisao;

public class Quadrado extends PoligonoRegular{

	public Quadrado(double lado) {
        super(4, lado);
    }

    @Override
    public double calcularArea() {
        return tamLado * tamLado;
    }
	
}
