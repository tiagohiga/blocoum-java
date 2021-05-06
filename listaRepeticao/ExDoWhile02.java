/*
 * Escrever um programa que receba vários números inteiros
 * no teclado. E no final imprimir a média dos números 
 * múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */

package listaRepeticao;
import java.util.Scanner;
public class ExDoWhile02 {
	public static void main(String args[]) {
		int cont = 0, num = 1; 
		float media = 0;
		Scanner ler = new Scanner(System.in);
		do {
			if(num % 3 == 0) {
				media += num;
				cont++;
			}
			System.out.printf("Informe um número: ");
			num = ler.nextInt();
		} while (num != 0);
		
		media /= cont;
		System.out.printf("Média dos valores múltiplos de três: %.2f", media);
	}
}
