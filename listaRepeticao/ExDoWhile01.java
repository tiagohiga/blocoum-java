/*
 * Crie um programa que leia um número do teclado até 
 * que encontre um número igual a zero. No final, mostre 
 * a soma dos números digitados.(DO...WHILE)
 */

package listaRepeticao;
import java.util.Scanner;
public class ExDoWhile01 {
	public static void main(String args[]) {
		int num = 0, soma = 0;
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.printf("Informe um número: ");
			num = ler.nextInt();
			soma += num;
		} while (num != 0);
		
		System.out.printf("Soma dos números informados: %d", soma);
	}
}
