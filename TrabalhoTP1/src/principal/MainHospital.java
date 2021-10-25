package principal;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Medico;
import entities.Paciente;
import entities.Pessoa;
import entities.Recepcionista;


public class MainHospital {    

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		
		Pessoa recepcao = new Recepcionista();
		Pessoa paciente = new Paciente();
		Pessoa medico = new Medico();
		Recepcionista recepcionista = new Recepcionista();
		ArrayList<Pessoa> listPaciente = new ArrayList<>();
		float temperatura, oxigenio;
		int opcao = 0;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out
					.println("\n\n### ### ### ### ### Hpvate ### ### ### ### ###");
			System.out.println("\n                ===============================");
			System.out.println("                  |     1 - Funcionario         |");
			System.out.println("                  |     2 - Paciente            |");
			System.out.println("                  |     0 - Sair                |");
			System.out.println("                  ==============================\n");
			
			System.out.print("\n");
			opcao = sc.nextInt();
			String nome, email, data, CadUnico,cep, cpf, telefone;
			nome = "Maria Rafaela";
			recepcao.setNome(nome);
			data = "24/10/2021";
			recepcao.setDataNacimento(data);
			
			nome = "Dra Rafaela Marques";
			medico.setNome(nome);
			email = "Maria_R@gmail.com";
			medico.setEmail(email);
			
			
			switch (opcao) {
			case 1:
				System.out.println("Area do Recepcionista");
				System.out.println("\n                ======================================");
				System.out.println("                  |     1 - Cadastrar Paciente         |");
				System.out.println("                  |     2 - Historico de Atividades    |");
				System.out.println("                  |     0 - Sair                       |");
				System.out.println("                  =====================================\n");
				opcao = sc.nextInt();
				sc.nextLine();
				
				
				
				
				switch (opcao) {
				case 1:
					System.out.println("Cadastre o nome do Pacienete: ");
					nome = sc.nextLine();
					paciente.setNome(nome);
					System.out.println("Cadastre a data de Nacimento: ");
					data = sc.nextLine();
					paciente.setDataNacimento(data);
					System.out.println("Cadastre o CPF: ");
					cpf = sc.nextLine();
					paciente.setCpf(cpf);
					System.out.println("Cadastre o Cep: ");
					cep = sc.nextLine();
					paciente.setCep(cep);
					System.out.println("Cadastre o Telefone: ");
					telefone = sc.nextLine();
					paciente.setTelefone(telefone);
					System.out.println("Cadastre o Email: ");
					email = sc.nextLine();
					paciente.setEmail(email);
					System.out.println("Cadastre o CadUnico: ");
					CadUnico = sc.nextLine();
					((Paciente) paciente).setCadastroUnico(CadUnico);
					
					System.out.println("Triagem do Paciente");
					System.out.println("Qual a temperatura do Paciente: ");
					temperatura = sc.nextFloat();
					paciente.triagem.setTemperatura(temperatura);
					System.out.println("Qual o Nivel de Oxigenio do Paciente: ");
					oxigenio = sc.nextFloat();
					paciente.triagem.setOxigenio(oxigenio);
					System.out.println("O paciente apresenta perda de Oufato? ");
					System.out.println("<1> Sim ");
					System.out.println("<2> Não ");
					opcao = sc.nextInt();
					if(opcao == 1) {
						paciente.triagem.oufato = true;
					}
					else if(opcao == 2) {
						paciente.triagem.oufato = false;
					}
					System.out.println("O paciente apresenta perda de Paladar? ");
					System.out.println("<1> Sim ");
					System.out.println("<2> Não ");
					opcao = sc.nextInt();
					if(opcao == 1) {
						paciente.triagem.paladar = true;
					}
					else if(opcao == 2) {
						paciente.triagem.paladar = false;
					}
					((Recepcionista) recepcao).Cadastro((Paciente) paciente);
					sc.nextLine();
					
					
					
					System.out.println("Encaminhamento do paciente!");
					int flag;
					paciente.triagem.statusMedico();
					flag = paciente.triagem.getNivelGravidade();
					if(flag == 1) {
						System.out.println("Gravidade Minima: Paciente Assintomatico");
						System.out.println("Paciente em isolamento em casa e monitoramento dos sintomas");
					}else if(flag == 2) {
						System.out.println("Gravidade Minima: Paciente com Sintomas leves");
						System.out.println("Paciente em isolamento em casa e monitoramento dos sintomas");
					}else if(flag == 3) {
						System.out.println("Gravidade Intermediaria: Paciente com Alguns Sintomas");
						System.out.println("Encaminhar para o Medico");
					}else {
						System.out.println("Gravidade Elevada: Sintomas Graves");
						System.out.println("Hospitalização Imediata e Acompanhamento Medico");
					}
					
					break;
					
				case 2:
					
					recepcao.HistoricoSistema();
					break;
				}
			
				break;
			case 3:
				System.out.println("Area do Medico");
				System.out.println("Area do Recepcionista");
				System.out.println("\n                ======================================");
				System.out.println("                  |     1 - Atender Paciente           |");
				System.out.println("                  |     2 - Historico de Atividades    |");
				System.out.println("                  |     0 - Sair                       |");
				System.out.println("                  =====================================\n");
				opcao = sc.nextInt();
				sc.nextLine();
				if(opcao == 1) {
					System.out.printf("Apresentando triagem do Paciente: %s\n", paciente.getNome());
					System.out.printf("Apresentando Resultado do exame: %s\n");
				}
				
				break;
			case 2:
				System.out.println("Paciente: Acesse seu Historico");
				paciente.HistoricoSistema();
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
