/*
 *  Faça um programa que receba a idade de uma pessoa e mostre na 
 *  saída em qual categoria ela se encontra:
    • 10-14 infantil
    • 15-17 juvenil
    • 18-25 adulto
 */

package listaCondicional;
import java.util.Scanner;
public class ExDecisao03 {
	public static void main(String args[]) {
		int idade;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe a idade: ");
		idade = ler.nextInt();
		if(idade >= 10 && idade <= 14) System.out.printf("\nInfantil");
		else if(idade >= 15 && idade <= 17) System.out.printf("\nJuvenil");
		else if(idade >= 18 && idade <= 25) System.out.printf("\nAdulto");
		else System.out.printf("\nIdade fora das categorias disponíveis");
	}
}
