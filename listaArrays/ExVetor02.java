/*
 * 2- Faça um programa que receba 6 números inteiros e mostre: 
 * • Os números pares digitados;  
 * • A soma dos números pares digitados; 
 * • Os números ímpares digitados; 
 * • A quantidade de números ímpares digitados.
 */

package listaArrays;
import java.util.Scanner;
public class ExVetor02 {
	static final int N = 6;
	
	public static void main(String[] args) {
		int[] numeros = new int[N];
		int[] pares = new int[N]; 
		int[] impares = new int[N];
		int somaPar = 0, contImpar = 0, indPar = 0, indImpar = 0, i;
		
		Scanner ler = new Scanner(System.in);
		
		for(i = 0; i < N; i++) {
			System.out.printf("Informe um número: ");
			numeros[i] = ler.nextInt();
			
			if(numeros[i] % 2 == 0) {
				somaPar += numeros[i];
				pares[indPar++] = numeros[i];
			} else {
				impares[indImpar++] = numeros[i];
				contImpar++;
			}
		}
		
		System.out.printf("\nSoma dos números pares: %d\nNúmeros pares informados: ", somaPar);
		for(i = 0; i < indPar; i++) {
			System.out.print(pares[i] + " ");
		}
		
		System.out.printf("\nQuantidade dos números ímpares: %d\nNúmeros ímpares informados: ", contImpar);
		for(i = 0; i < indImpar; i++) {
			System.out.print(impares[i] + " ");
		}
	}
}
