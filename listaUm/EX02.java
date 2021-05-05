package listaUm;

import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {
		int dias = 0, meses = 0, anos = 0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe a idade em dias: ");
		dias = ler.nextInt();
		anos = dias / 365;
		meses = (dias % 365) / 30;
		dias = (dias % 365) % 30;
		System.out.printf("Você tem %d anos, %d meses e %d dias", anos, meses, dias);
	}
}
