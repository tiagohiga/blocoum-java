package listaOOP;

import java.util.Scanner;
public class ClienteTeste {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("José", "11 99953-2137", "jose@mail.com", "441.852.321-00", 11011990);
		cliente1.imprimirInfo();
		
		Scanner ler = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.print("\nInforme o dado que deseja alterar\n");
			System.out.print("\n1. Alterar nome\n2. Alterar CPF\n3. Alterar data de cadastro (Apenas números)"
					+ "\n4. Alterar telefone\n5. Alterar e-mail\n6. Exibir cadastro\n0. Sair\n");
			opcao = ler.nextInt();
			cliente1.alterarCadastro(ler, opcao);
		} while(opcao > 0 && opcao <= 6);
		
		System.out.print("\nFim.\n");
	}
	
}
