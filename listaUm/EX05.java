package listaUm;

import java.util.Scanner;

public class EX05 {
	public static void main(String args[]) {
		float nota1, nota2, nota3, media;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe a 1ª nota: ");
		nota1 = ler.nextFloat();
		System.out.printf("Informe a 2ª nota: ");
		nota2 = ler.nextFloat();
		System.out.printf("Informe a 3ª nota: ");
		nota3 = ler.nextFloat();
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		System.out.printf("\nMédia: %.2f", media);
	}
}

