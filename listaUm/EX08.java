package listaUm;
import java.util.Scanner;
public class EX08 {
	public static void main(String args[]) {
		float valor;
		double precoFinal = 0.0;
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Informe o valor do veículo: ");
		valor = ler.nextFloat();
		
		precoFinal = valor * 1.73;
		
		System.out.printf("Valor final: R$%.2f", precoFinal);
	}
}
