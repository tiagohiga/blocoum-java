package listaOOP;

import java.util.Scanner;
public class PacienteTeste {
	public static void main(String[] args) {
		Paciente pac = new Paciente("Marco Antonio", "Enfermaria", 47, 2, 25042021, "SIM");
		Scanner ler = new Scanner(System.in);
		
		pac.cadastrarPaciente(ler);
		
		pac.exibirPaciente();
	}
}
