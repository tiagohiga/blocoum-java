/*
 * Faça um programa que entre com três números e coloque em ordem crescente.
 */

package listaCondicional;
import java.util.Scanner;
public class ExDecisao02 {
	public static void main(String args[]) {
		int a, b, c, temp;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe o primeiro valor: ");
		a = ler.nextInt();
		System.out.printf("Informe o segundo valor:  ");
		b = ler.nextInt();
		System.out.printf("Informe o terceiro valor: ");
		c = ler.nextInt();
		
		if(a >= b && a >= c) {
			temp = a;
			a = c;
			c = temp;
		} else if (b >= a && b >= c) {
			temp = b;
			b = c;
			c = temp;
		}
		
		if(a > b) {
			temp = b;
			b = a;
			a = temp;
		}
		
		System.out.printf("Ordem crescente: %d, %d, %d", a, b, c);
	}
}
