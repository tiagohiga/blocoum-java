package listaHeranca;

public class Preguica extends Animal{
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void somEmitido(String som) {
		System.out.printf("A %s faz %s", getNome(), som);
	}
	
	@Override
	public void movimentarAnimal(String mov) {
		System.out.printf(" e agora %s está %s\n", getNome(), mov);
	}
}
