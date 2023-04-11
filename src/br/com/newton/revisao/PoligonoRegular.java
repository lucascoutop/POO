package br.com.newton.revisao;

public abstract class PoligonoRegular {

	protected int numLados;
    protected double tamLado;

    public PoligonoRegular(int numLados, double tamLado) {
        this.numLados = numLados;
        this.tamLado = tamLado;
    }

    public abstract double calcularArea();

    public double calcularPerimetro() {
        return numLados * tamLado;
    }
	
}
