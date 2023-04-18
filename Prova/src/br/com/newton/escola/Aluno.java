package br.com.newton.escola;

public class Aluno extends Pessoa{

    private int periodo;
    private int turma;

    public Aluno() {

    }

    public String mostraAluno(){
        return "Nome: " +getNome()+ "Email: " +getEmail()+ "Periodo: " +getPeriodo()+ "Turma: " +getTurma();
    }

    public Aluno(int periodo, int turma) {
        this.periodo = periodo;
        this.turma = turma;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }
}
