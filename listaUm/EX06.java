package listaUm;
import java.util.Scanner;
public class EX06 {
	public static void main(String args[]) {
		float x1, y1, x2, y2; 
		double d, x, y;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe a primeira coordenada\nx1: ");
		x1 = ler.nextFloat();
		System.out.printf("y1: ");
		y1 = ler.nextFloat();
		System.out.printf("Informe a segunda coordenada\nx2: ");
		x2 = ler.nextFloat();
		System.out.printf("y2: ");
		y2 = ler.nextFloat();
		x = (x2 - x1) * (x2 - x1);
		y = (y2 - y1) * (y2 - y1);
		d = Math.sqrt((x + y));
		System.out.printf("Distância entre P(%.2f;%.2f) e P(%.2f;%.2f) é D(%.2f)", x1, y1, x2, y2, d);
	}
}
