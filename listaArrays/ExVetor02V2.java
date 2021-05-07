/*
 * 2- Faça um programa que receba 6 números inteiros e mostre: 
 * • Os números pares digitados;  
 * • A soma dos números pares digitados; 
 * • Os números ímpares digitados; 
 * • A quantidade de números ímpares digitados.
 */

package listaArrays;
import java.util.Scanner;
public class ExVetor02V2 {
	static final int N = 6;
	
	public static void main(String[] args) {
		int[] numeros = new int[N];
		int somaPar = 0, contImpar = 0, i;
		
		Scanner ler = new Scanner(System.in);
		
		for(i = 0; i < N; i++) {
			System.out.printf("Informe um número: ");
			numeros[i] = ler.nextInt();
			
			if(numeros[i] % 2 == 0) somaPar += numeros[i];
			else contImpar++;
		}
		
		System.out.printf("Números pares digitados: ");
		for(i = 0; i < N; i++) {
			if(numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
			}
		}
		System.out.printf("\nSoma dos pares digitados: %d\n", somaPar);

		System.out.printf("Números ímpares digitados: ");
		for(i = 0; i < N; i++) {
			if(numeros[i] % 2 != 0) {
				System.out.print(numeros[i] + " ");
			}
		}
		System.out.printf("\nQuantidade de números ímpares digitados: %d", contImpar);

	}
}
