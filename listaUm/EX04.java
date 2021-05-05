package listaUm;

import java.util.Scanner;

public class EX04 {
	public static void main(String args[]) {
		int a, b, c, r, s;
		float d;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe o valor de A: ");
		a = ler.nextInt();
		System.out.printf("Informe o valor de B: ");
		b = ler.nextInt();
		System.out.printf("Informe o valor de C: ");
		c = ler.nextInt();
		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		d = (float)(r + s) / 2;
		System.out.printf("D = %.2f", d);
	}
}
