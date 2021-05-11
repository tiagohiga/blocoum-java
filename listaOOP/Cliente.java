package listaOOP;
import java.util.Scanner;

public class Cliente {
	private String nomeCliente;
	private String telefone;
	private String email;
	private String cpfCliente;
	private int dataCadastro;
	
	public Cliente(String nomeCliente, String telefone, String email, String cpfCliente, int dataCadastro) {
		this.nomeCliente = nomeCliente;
		this.telefone = telefone;
		this.email = email;
		this.cpfCliente = cpfCliente;
		this.dataCadastro = dataCadastro;
	}
	
	public void imprimirInfo() {
		System.out.print("O cliente " + nomeCliente + " portador do CPF " + cpfCliente + " foi cadastrado em " + this.formatarData() + "\n");
		System.out.print("Seu telefone para contato é " + telefone + " e seu e-mail é " + email + "\n");
	}
	
	private String formatarData() {
		int dia, mes, ano;
		ano = dataCadastro % 10000;
		mes = (dataCadastro / 10000) % 10;
		dia = (dataCadastro / 10000) / 100;
		String dataFormatada = String.format("%02d/%02d/%d", dia, mes, ano);
		return dataFormatada;
	}
	
	public void alterarCadastro(Scanner ler, int opcao) {
		ler.nextLine();
		switch(opcao) {
			case 1:
				System.out.print("Informe o novo nome:");
				this.setNomeCliente(ler.nextLine());
				break;
			case 2:
				System.out.print("Informe o novo CPF:");
				this.setCpfCliente(ler.nextLine());
				break;
			case 3:
				System.out.print("Informe o novo data de cadastro:");
				this.setDataCadastro(ler.nextInt());
				break;
			case 4:
				System.out.print("Informe o novo telefone:");
				this.setTelefone(ler.nextLine());
				break;
			case 5:
				System.out.print("Informe o novo e-mail:");
				this.setEmail(ler.nextLine());
				break;
			case 6:
				this.imprimirInfo();
		}
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public int getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(int dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
}
