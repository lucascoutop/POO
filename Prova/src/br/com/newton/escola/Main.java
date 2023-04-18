package br.com.newton.escola;

public class Main {
    public static void main(String[] args) {

        Pessoa professor = new Professor();
        System.out.println(professor.mostraProfessor());

        Pessoa aluno = new Aluno();
        System.out.println(aluno.mostraAluno);
    }
}
