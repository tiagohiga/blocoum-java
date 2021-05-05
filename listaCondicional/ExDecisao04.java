/*
 * Faça um programa em que permita a entrada de um número qualquer e 
 * exiba se este número é par ou ímpar. Se for par exiba também a raiz 
 * quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
 */

package listaCondicional;
import java.util.Scanner;
public class ExDecisao04 {
	public static void main(String args[]) {
		int num;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe um número: ");
		num = ler.nextInt();
		if(num % 2 == 0) {
			System.out.printf("O número %d é par e sua raiz quadrada é %f", num, Math.sqrt((double)num));
		} else {
			System.out.printf("O número %d é ímpar e seu quadrado é %d", num, (num * num));
		}
	}
}
