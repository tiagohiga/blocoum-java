package listaHeranca;

public class Animal {
	private String nome;
	private int idade;
	private String somEmitido;
	private int podeCorrer;
	private boolean sobeArvores;
	
	public Animal(String nome, int idade, String somEmitido, int podeCorrer) {
		this.nome = nome;
		this.idade = idade;
		this.somEmitido = somEmitido;
		this.podeCorrer = podeCorrer;
	}
	
	public Animal(String nome, int idade, String somEmitido, boolean sobeArvores) {
		this.nome = nome;
		this.idade = idade;
		this.somEmitido = somEmitido;
		this.sobeArvores = sobeArvores;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSomEmitido() {
		return somEmitido;
	}

	public void setSomEmitido(String somEmitido) {
		this.somEmitido = somEmitido;
	}

	public int getPodeCorrer() {
		return podeCorrer;
	}

	public void setPodeCorrer(int podeCorrer) {
		this.podeCorrer = podeCorrer;
	}

	public boolean isSobeArvores() {
		return sobeArvores;
	}

	public void setSobeArvores(boolean sobeArvores) {
		this.sobeArvores = sobeArvores;
	}
	
}
