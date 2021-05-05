package listaUm;

import java.util.Scanner;

public class EX03 {
	public static void main(String args[]) {
		int segundos = 0, minutos = 0, horas = 0;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe o tempo decorrido em segundos: ");
		segundos = ler.nextInt();
		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		segundos = (segundos % 3600) % 60;
		System.out.printf("Tempo decorrido: %dhrs:%dmin:%dseg", horas, minutos, segundos);
	}
}
