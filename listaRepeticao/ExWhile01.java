/*
 * Solicitar a idade de várias pessoas e imprimir: 
 * Total de pessoas com menos de 21 anos. Total de pessoas 
 * com mais de 50 anos. O programa termina quando idade for =-99. 
 * (WHILE)
 */

package listaRepeticao;
import java.util.Scanner;
public class ExWhile01 {
	public static void main(String args[]) {
		int idade = 0, menosVinte = 0, maisCinq = 0;
		Scanner ler = new Scanner(System.in);
		
		while (idade != -99) {
			System.out.printf("Informe a idade: ");
			idade = ler.nextInt();
			if(idade >= 0 && idade < 21) menosVinte++;
			else if(idade > 50) maisCinq++;
		}
		System.out.printf("Total de pessoas com menos de 21 anos é %d\n", menosVinte);
		System.out.printf("Total de pessoas com mais de 50 anos é %d\n", maisCinq);
	}
}
