/*
 * Faça um programa que receba três inteiros e diga qual deles é o maior.
 */

package listaCondicional;
import java.util.Scanner;

public class ExDecisao01 {
	public static void main(String args[]) {
		int a, b, c, maior;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe o primeiro valor: ");
		a = ler.nextInt();
		System.out.printf("Informe o segundo valor: ");
		b = ler.nextInt();
		System.out.printf("Informe o terceiro valor: ");
		c = ler.nextInt();
		maior = c;
		if(a > maior) maior = a;
		if(b > maior) maior = b;
		System.out.printf("\nMaior número: %d", maior);
	}
}
