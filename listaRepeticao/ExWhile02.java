/*
 *  Uma empresa desenvolveu uma pesquisa para saber as características 
 *  psicológicas dos indivíduos de uma região. Para tanto, a cada uma 
 *  das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
 *  e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a 
 *  pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os dados 
 *  de 150 pessoas, calcule e mostre: (WHILE)
    • o número de pessoas calmas; 
    • o número de mulheres nervosas; 
    • o número de homens agressivos; 
    • o número de outros calmos;
    • o número de pessoas nervosas com mais de 40 anos; 
    • o número de pessoas calmas com menos de 18 anos.
 */

package listaRepeticao;
import java.util.Scanner;
public class ExWhile02 {
	public static void main(String args[]) {
		int cont = 0, idade, sexo, humor;
		int contCalmas = 0, contMNerv = 0, contHAgres = 0, contOCalm = 0, contQuarNerv = 0, contDezoitoCalm = 0;
		Scanner ler = new Scanner(System.in);
		
		while(cont < 150) {
			System.out.printf("Informe sua idade: ");
			idade = ler.nextInt();
			
			System.out.printf("\nInforme seu sexo \n"
					+ "1 - Feminino\n2 - Masculino\n3 - Outros\n");
			sexo = ler.nextInt();
			
			System.out.printf("\nComo definiria seu humor hoje?\n"
					+ "1 - Calmo(a)(e)\n2 - Nervoso(a)(e)\n3 - Agressivo(a)(e)\n");
			humor = ler.nextInt();
			
			if(humor == 1) contCalmas++;
			
			if(sexo == 1 && humor == 2) contMNerv++;
			else if(sexo == 2 && humor == 3) contHAgres++;
			else if(sexo == 3 && humor == 1) contOCalm++;
			
			if(humor == 2 && idade > 40) contQuarNerv++;
			else if(humor == 1 && (idade >= 0 && idade < 18)) contDezoitoCalm++;
			
			cont++;
		}
		
		System.out.printf("Número de pessoas calmas: %d\n", contCalmas);
		System.out.printf("Número de mulheres nervosas: %d\n", contMNerv);
		System.out.printf("Número de homens agressivos: %d\n", contHAgres);
		System.out.printf("Número de outros calmos: %d\n", contOCalm);
		System.out.printf("Número de pessoas nervosas com mais de 40 anos: %d\n", contQuarNerv);
		System.out.printf("Número de pessoas calmas com menos de 18 anos: %d\n", contDezoitoCalm);
	}
}
