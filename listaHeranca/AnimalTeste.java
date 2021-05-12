package listaHeranca;

public class AnimalTeste {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Tchutchucão", 15);
		Cavalo horse = new Cavalo("Spirit", 20);
		Preguica sloth = new Preguica("Flash", 11);
		
		Animal animal = null;
		animal = dog;
		animal.somEmitido("auauauauauauauau");
		animal.movimentarAnimal("correndo");
		
		animal = horse;
		animal.somEmitido("ihhhhhhhhhhhhhhhhhh");
		animal.movimentarAnimal("correndo");
		
		animal = sloth;
		animal.somEmitido("AHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
		animal.movimentarAnimal("subindo em árvores");

	}
}
