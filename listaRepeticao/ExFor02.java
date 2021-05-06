/*
 * Ler 10 números e imprimir quantos são pares 
 * e quantos são ímpares. (FOR)
 */
package listaRepeticao;
import java.util.Scanner;
public class ExFor02 {
	public static void main(String args[]) {
		int num, contPar = 0, contImpar = 0;
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("Entre com o %dº número: ", (i + 1));
			num = ler.nextInt();
			if(num % 2 == 0) contPar++;
			else contImpar++;
		}
		
		System.out.printf("Quantidade de números pares informados: %d\n", contPar);
		System.out.printf("Quantidade de números ímpares informados: %d\n", contImpar);
	}
}
