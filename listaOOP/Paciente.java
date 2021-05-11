package listaOOP;

import java.util.Scanner;
public class Paciente {
	private String nomePaciente;
	private String setor;
	private int numeroQuarto;
	private int grauEnfermidade;
	private int dataAdmissao;
	private String acompanhado;
	
	public Paciente(String nomePaciente, String setor, int numeroQuarto, int grauEnfermidade, int dataAdmissao, String acompanhado) {
		this.nomePaciente = nomePaciente;
		this.setor = setor;
		this.numeroQuarto = numeroQuarto;
		this.grauEnfermidade = grauEnfermidade;
		this.dataAdmissao = dataAdmissao;
		this.acompanhado = acompanhado;
	}
	
	public void cadastrarPaciente(Scanner ler) {
		System.out.print("Informe os dados do paciente para cadastro\n");
		
		System.out.print("\nInforme o nome do paciente: ");
		this.setNomePaciente(ler.nextLine());
		
		System.out.print("\nInforme o setor no qual o paciente será alocado: ");
		this.setSetor(ler.nextLine());
		
		System.out.print("\nInforme o número do quarto do paciente: ");
		this.setNumeroQuarto(ler.nextInt());
		
		System.out.print("\nInforme o grau de enfermidade do paciente (1 - 5): ");
		this.setGrauEnfermidade(ler.nextInt());
		
		System.out.print("\nInforme a data de admissão do paciente (apenas números): ");
		this.setDataAdmissao(ler.nextInt());
		
		ler.nextLine();
		System.out.print("\nO paciente está acompanhado (Sim/Não): ");
		this.setAcompanhado(ler.nextLine());
	}
	
	public void exibirPaciente() {
		String msg;
		msg = this.acompanhado.equalsIgnoreCase("sim")  ? "está acompanhado." : "não está acompanhado."; 
		
		System.out.printf("O paciente %s está no setor %s, quarto número %d. ", nomePaciente, setor, numeroQuarto);
		System.out.printf("\nFoi admitido em " + formatarData() + " com um grau de enfermidade %d.", grauEnfermidade, ". ");
		System.out.printf("\nAtualmente o paciente %s\n", msg);
	}
	
	private String formatarData() {
		int dia, mes, ano;
		ano = dataAdmissao % 10000;
		mes = (dataAdmissao / 10000) % 10;
		dia = (dataAdmissao / 10000) / 100;
		String dataFormatada = String.format("%02d/%02d/%d", dia, mes, ano);
		return dataFormatada;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public int getNumeroQuarto() {
		return numeroQuarto;
	}
	
	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public int getGrauEnfermidade() {
		return grauEnfermidade;
	}

	public void setGrauEnfermidade(int grauEnfermidade) {
		this.grauEnfermidade = grauEnfermidade;
	}

	public int getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(int dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	public String getAcompanhado() {
		return acompanhado;
	}
	
	public void setAcompanhado(String acompanhado) {
		this.acompanhado = acompanhado;
	}
	
}
