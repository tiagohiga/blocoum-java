package listaOOP;

public class Funcionario {
	private String nomeFuncionario;
	private String matricula;
	private String funcao;
	private int dataAdmissao;
	private float salario;
	float comissao = 0;
	
	public Funcionario(String nomeFuncionario, String matricula, String funcao, int dataAdmissao, float salario) {
		this.nomeFuncionario = nomeFuncionario;
		this.matricula = matricula;
		this.funcao = funcao;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}
	
	public void exibirFuncionario() {
		System.out.printf("\n\nInformações de funcionarie %s:\n", nomeFuncionario);
		System.out.printf("Funcionárie %s, número de matrícula: %s, atualmente exerce a função de %s.\n", nomeFuncionario, matricula, funcao);
		System.out.printf("Foi admitide em " + formatarData() + " e seu salário é R$%.2f", salario);
	}
	
	private String formatarData() {
		int dia, mes, ano;
		ano = dataAdmissao % 10000;
		mes = (dataAdmissao / 10000) % 10;
		dia = (dataAdmissao / 10000) / 100;
		String dataFormatada = String.format("%02d/%02d/%d", dia, mes, ano);
		return dataFormatada;
	}
	
	public void aumentarSalario(float comissao) {
		float sal = this.salario;
		sal *= 1 + (comissao/100);
		this.salario = sal;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public int getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(int dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	
}
