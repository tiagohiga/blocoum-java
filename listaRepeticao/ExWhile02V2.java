package listaRepeticao;
import java.util.Scanner;

public class ExWhile02V2 {
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
			
			switch(humor) {
				case 1:
					contCalmas++;
					if(sexo == 3) contOCalm++;
					if(idade >= 0 && idade < 18) contDezoitoCalm++;
					break;
				case 2:
					if(sexo == 1) contMNerv++;
					if(idade > 40) contQuarNerv++;
					break;
				default:
					if(sexo == 2) contHAgres++;
			}
			
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
