package listaHeranca;

public class Cavalo extends Animal{
	public Cavalo (String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void somEmitido(String som) {
		System.out.printf("O %s faz %s", getNome(), som);
	}
	
	@Override
	public void movimentarAnimal(String mov) {
		System.out.printf("e agora %s está %s\n", getNome(), mov);
	}
}
