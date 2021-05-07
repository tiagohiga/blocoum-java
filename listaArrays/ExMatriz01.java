/*
 * 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */
package listaArrays;
import java.util.Scanner;

public class ExMatriz01 {
	static final int L = 3;
	static final int C = 3;
	
	public static void main(String[] args) {
		int[][] valores = new int[L][C];
		int cont = 0, i, j;
		Scanner ler = new Scanner(System.in);
		
		for(i = 0; i < L; i++) {
			for(j = 0; j < C; j++) {
				System.out.print("Informe um número: ");
				valores[i][j] = ler.nextInt();
				if(valores[i][j] > 10) cont++;
			}
		}
		
		System.out.printf("\nTotal de valores maiores que 10: %d\nValores maiores que 10 informados: ", cont);
		for(i = 0; i < L; i++) {
			for(j = 0; j < C; j++) {
				if(valores[i][j] > 10) {
					System.out.print(valores[i][j] + " ");
				}
			}
		}
	}
}
