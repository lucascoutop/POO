package br.com.newton.escola;

public class Professor extends Pessoa{

    private float salarioHora;
    private int horasAula;

    public String mostraProfessor(){
        return "Nome: " +getNome()+ "Email: " +getEmail()+ "Salario:" +calculaSalario();
    }

    public double calculaSalario(){
        return this.salarioHora * this.horasAula;
    }

    public float getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasAula() {
        return horasAula;
    }

    public void setHorasAula(int horasAula) {
        this.horasAula = horasAula;
    }
}
