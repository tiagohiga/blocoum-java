package listaOOP;

public class FuncionarioTeste {
	public static void main(String[] args) {
		Funcionario func = new Funcionario("Maria Roberta", "9452-5", "Gerente", 8051987, (float) 8500.75);
		func.exibirFuncionario();
		func.aumentarSalario(40);
		func.exibirFuncionario();
	}
}
