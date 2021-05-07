/*
 * 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. 
 * Ofereça ao usuário um menu de opções:
 * (1) somar as duas matrizes 
 * (2) subtrair a primeira matriz da segunda 
 * (3) adicionar uma constante as duas matrizes
 * (4) imprimir as matrizes 
 * Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
 * Na terceira opção o valor da constante deve ser lido e o resultado da 
 * adição da constante deve ser armazenado na própria matriz.
 */

package listaArrays;
import java.util.Scanner;

public class ExMatriz02 {
	static final int L = 2;
	static final int C = 2;
	
	public static void main(String[] args) {
		float[][] matrizA = new float[L][C];
		float[][] matrizB = new float[L][C];
		float[][] matrizRes = new float [L][C];
		int i, j, opcao, valor;
		
		Scanner ler = new Scanner(System.in);
		
		for(i = 0; i < L; i++) {
			for(j = 0; j < C; j++) {
				System.out.printf("Informe o [%d][%d] da primeira matriz: ", i, j);
				matrizA[i][j] = ler.nextFloat();
			}
		}
		System.out.printf("\n");
		for(i = 0; i < L; i++) {
			for(j = 0; j < C; j++) {
				System.out.printf("Informe o [%d][%d] da segunda matriz: ", i, j);
				matrizB[i][j] = ler.nextFloat();
			}
		}
		
		
		do {
			System.out.printf("\n\tComo gostaria de manipular as matrizes?"
					+ "\n\t(1) somar as duas matrizes"
					+ "\n\t(2) subtrair a primeira matriz da segunda"
					+ "\n\t(3) adicionar uma constante as duas matrizes"
					+ "\n\t(4) imprimir as matrizes\n");
			opcao = ler.nextInt();
		} while (opcao < 1 || opcao > 4);
		
		switch(opcao) {
			case 1:
				for(i = 0; i < L; i++) {
					for(j = 0; j < C; j++) {
						matrizRes[i][j] = matrizA[i][j] + matrizB[i][j];
					}
				}
				
				for(i = 0; i < L; i++) {
					for(j = 0; j < C; j++) {
						System.out.printf("[%.2f]", matrizA[i][j]);
					}
					System.out.printf("+");
					for(j = 0; j < C; j++) {
						System.out.printf("[%.2f]", matrizB[i][j]);
					}
					System.out.printf("\t");
					for(j = 0; j < C; j++) {
						System.out.printf("[%.2f]", matrizRes[i][j]);
					}
					System.out.printf("\n");
				}
				break;
			case 2:
				for(i = 0; i < L; i++) {
					for(j = 0; j < C; j++) {
						matrizRes[i][j] = matrizB[i][j] - matrizA[i][j];
					}
				}
				
				for(i = 0; i < L; i++) {
					for(j = 0; j < C; j++) {
						System.out.printf("[%.2f]", matrizA[i][j]);
					}
					System.out.printf("-");
					for(j = 0; j < C; j++) {
						System.out.printf("[%.2f]", matrizB[i][j]);
					}
					System.out.printf("\t");
					for(j = 0; j < C; j++) {
						System.out.printf("[%.2f]", matrizRes[i][j]);
					}
					System.out.printf("\n");
				}
				break;
			case 3:
				System.out.printf("Informe a constante: ");
				valor = ler.nextInt();
				
				for(i = 0; i < L; i++) {
					for(j = 0; j < C; j++) {
						matrizA[i][j] += valor;
						matrizB[i][j] += valor;
					}
				}
				
				for(i = 0; i < L; i++) {
					for(j = 0; j < C; j++) {
						System.out.printf("[%.2f]", matrizA[i][j]);
					}
					System.out.printf("\t");
					for(j = 0; j < C; j++) {
						System.out.printf("[%.2f]", matrizB[i][j]);
					}
					System.out.printf("\n");
				}
				break;
			case 4:
				for(i = 0; i < L; i++) {
					System.out.printf("A");
					for(j = 0; j < C; j++) {
						System.out.printf("[%.2f]", matrizA[i][j]);
					}
					System.out.printf("\tB");
					for(j = 0; j < C; j++) {
						System.out.printf("[%.2f]", matrizB[i][j]);
					}
					System.out.printf("\n");
				}
				break;
		}
	}
}
