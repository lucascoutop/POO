package br.com.newton.ex2;

public class Empresa {

	private String nome;
    private String cnpj;
    private int qtdeFuncionario;
    private Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.qtdeFuncionario = 0;
        this.funcionarios = new Funcionario[100];
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (qtdeFuncionario < 100) {
            funcionarios[qtdeFuncionario] = funcionario;
            qtdeFuncionario++;
        } else {
            System.out.println("Não é possível adicionar mais funcionários. Limite atingido.");
        }
    }

    public void mostrarFuncionarios() {
        for (int i = 0; i < qtdeFuncionario; i++) {
            funcionarios[i].mostrarDados();
        }
    }
	
}
