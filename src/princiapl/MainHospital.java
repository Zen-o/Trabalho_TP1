package principal;

import java.util.Scanner;

import entities.Recepcionista;

public class MainHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Recepcionista recepcao = new Recepcionista();
		int opcao = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out
					.println("\n\n### ### ### ### ### Hpvate ### ### ### ### ###");
			System.out.println("\n                  =========================");
			System.out.println("                  |     1 - Funcionario         |");
			System.out.println("                  |     2 - Paciente            |");
			System.out.println("                  |     0 - Sair                |");
			System.out.println("                  =========================\n");
			
			System.out.print("\n");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Cadastro Recepcionista");
				
				break;
			case 2:
				System.out.println("Paciente");
				break;
			case 0:
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (opcao != 0);
		sc.close();

	}

}
