package br.com.newton.ex2;

public class Main {
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("João", "joao@email.com", "123456789", 
	                "Departamento A", 3000.00, "01/01/2023", "123456789");
	    Funcionario funcionario2 = new Funcionario("Maria", "maria@email.com", "987654321",
	                "Departamento B", 4000.00, "01/02/2023", "987654321");

	        Funcionario[] funcionarios = {funcionario1, funcionario2};
	        for (Funcionario funcionario : funcionarios) {
	            funcionario.mostrarDados();
	        }

	        Empresa empresa = new Empresa("Minha Empresa", "123456789");
	        empresa.adicionarFuncionario(funcionario1);
	        empresa.adicionarFuncionario(funcionario2);
	        empresa.mostrarFuncionarios();
	 }
	
}
