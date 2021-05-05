package listaUm;

import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {
		int anos = 0, meses = 0, dias = 0;
		System.out.println("Informe a idade em dias, meses e anos");
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe quantos anos: ");
		anos = ler.nextInt();
		
		System.out.println("Informe quantos meses: ");
		meses = ler.nextInt();
		
		System.out.println("Informe quantos dias: ");
		dias = ler.nextInt();
		
		dias = dias + (meses * 30) + (anos * 365);
		
		System.out.println("Idade em dias: " + dias);
	}
}
