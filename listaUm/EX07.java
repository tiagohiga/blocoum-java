package listaUm;
import java.util.Scanner;
public class EX07 {
	public static void main(String args[]) {
		float a, b, c, d, e, f, den, x, y;
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("\tInforme os valores\n");
		
		System.out.printf("a: ");
		a = ler.nextFloat();
		System.out.printf("b: ");
		b = ler.nextFloat();
		System.out.printf("c: ");
		c = ler.nextFloat();
		System.out.printf("d: ");
		d = ler.nextFloat();
		System.out.printf("e: ");
		e = ler.nextFloat();
		System.out.printf("f: ");
		f = ler.nextFloat();
		
		den = (a * e) - (b * d);
		x = ((c * e) - (b * f)) / den;
		y = ((a * f) - (c * d)) / den;
		
		System.out.printf("x: %.2f e y: %.2f", x, y);
	}
}
