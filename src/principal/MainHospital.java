package principal;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Laboratorio;
import entities.Medico;
import entities.Paciente;
import entities.Pessoa;
import entities.Recepcionista;
import entities.Triagem;


public class MainHospital {    

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		
		Pessoa recepcao = new Recepcionista();
		Pessoa paciente = new Paciente();
		Pessoa medico = new Medico();
		Triagem triagem = new Triagem();
		Laboratorio laboratorio = new Laboratorio();
		ArrayList<Pessoa> listaPaciente = new ArrayList<>();
		boolean teste;
		float temperatura, oxigenio;
		int opcao = 0;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out
					.println("\n\n### ### ### ### ### Hpvate ### ### ### ### ###");
			System.out.println("\n                ===============================");
			System.out.println("                  |     1 - Funcionario         |");
			System.out.println("                  |     2 - Medico              |");
			System.out.println("                  |     3 - Paciente            |");			
			System.out.println("                  |     0 - Sair                |");
			System.out.println("                  ==============================\n");
			
			System.out.print("\n");
			opcao = sc.nextInt();
			String nome, email, data, CadUnico = null,cep, cpf = null, telefone;
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
				System.out.println("                  |     3 - Pesquisar Paciente         |");
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
					System.out.println("<2> N??o ");
					opcao = sc.nextInt();
					if(opcao == 1) {
						paciente.triagem.oufato = true;
					}
					else if(opcao == 2) {
						paciente.triagem.oufato = false;
					}
					System.out.println("O paciente apresenta perda de Paladar? ");
					System.out.println("<1> Sim ");
					System.out.println("<2> N??o ");
					opcao = sc.nextInt();
					if(opcao == 1) {
						paciente.triagem.paladar = true;
					}
					else if(opcao == 2) {
						paciente.triagem.paladar = false;
					}
					((Recepcionista) recepcao).Cadastro(new Paciente(nome,data,email,cpf,cep,telefone,CadUnico));			
					sc.nextLine();
					
					
					
					System.out.println("Encaminhamento do paciente!");
					int flag;
					paciente.triagem.statusMedico();
					flag = paciente.triagem.getNivelGravidade();
					if(flag == 1) {
						System.out.println("Gravidade Minima: Paciente Assintomatico");
						System.out.println("Paciente em isolamento em casa e monitoramento dos sintomas");
						teste = laboratorio.Exame(flag);
						((Paciente) paciente).setTesteCovid(teste);
						((Paciente) paciente).AddPaciente(new Paciente(nome,data,email,cpf,cep,telefone,CadUnico,teste));
						((Paciente) paciente).AddTriagem(temperatura,oxigenio);

					}else if(flag == 2) {
						System.out.println("Gravidade Minima: Paciente com Sintomas leves");
						System.out.println("Paciente em isolamento em casa e monitoramento dos sintomas");
						teste = laboratorio.Exame(flag);
						((Paciente) paciente).setTesteCovid(teste);
						((Paciente) paciente).AddPaciente(new Paciente(nome,data,email,cpf,cep,telefone,CadUnico,teste));
						((Paciente) paciente).AddTriagem(temperatura,oxigenio);
					}else if(flag == 3) {
						System.out.println("Gravidade Intermediaria: Paciente com Alguns Sintomas");
						System.out.println("Encaminhar para o Medico");
						teste = laboratorio.Exame(flag);
						((Paciente) paciente).setTesteCovid(teste);
						((Paciente) paciente).AddPaciente(new Paciente(nome,data,email,cpf,cep,telefone,CadUnico,teste));
						((Paciente) paciente).AddTriagem(temperatura,oxigenio);
						((Medico) medico).AddPaciente(new Paciente(nome,cpf,CadUnico,teste));
						((Medico) medico).AddTriagem(temperatura,oxigenio);
					}else {
						System.out.println("Gravidade Elevada: Sintomas Graves");
						System.out.println("Hospitaliza????o Imediata e Acompanhamento Medico");
						teste = laboratorio.Exame(flag);
						((Paciente) paciente).setTesteCovid(teste);
						((Paciente) paciente).AddPaciente(new Paciente(nome,data,email,cpf,cep,telefone,CadUnico,teste));
						((Paciente) paciente).AddTriagem(temperatura,oxigenio);
						((Medico) medico).AddPaciente(new Paciente(nome,cpf,CadUnico,teste));
						((Medico) medico).AddTriagem(temperatura,oxigenio);
					}
					
					break;
					
				case 2:
					
					recepcao.HistoricoSistema();
					break;
					
				case 3:
					System.out.println("Digite o nome do paciente: ");
					nome = sc.nextLine();
					boolean encontro = ((Recepcionista) recepcao).PesquisaNome(nome);
					if(encontro == true) {
						
					}else {
						System.out.println("Paciente n??o Encontrado");
					}
					break;
				}
				
			
				break;
			case 2:
				System.out.println("Area do Medico");
				System.out.println("\n                ======================================");
				System.out.println("                  |     1 - Atender Paciente           |");
				System.out.println("                  |     2 - Historico de Atividades    |");
				System.out.println("                  |     0 - Sair                       |");
				System.out.println("                  =====================================\n");
				opcao = sc.nextInt();
				sc.nextLine();

				
				switch (opcao) {
				case 1:
					System.out.println("Digite o nome do paciente: ");
					
					nome = sc.nextLine();
					boolean encontro = ((Medico) medico).PesquisaNome(nome);
					if(encontro == true) {
						
					}else {
						System.out.println("Paciente n??o Encontrado");
					}
					break;
					
				case 2:
					
					medico.HistoricoSistema();
					break;
					
				case 0:
					
					break;
				}
				
				
				break;
			case 3:
				System.out.println("Area do Paciente");
				
				System.out.println("\n                ======================================");
				System.out.println("                  |     1 - Entrar no Sistema          |");
				System.out.println("                  |     2 - Lista de Pacientes         |");
				System.out.println("                  |     0 - Sair                       |");
				System.out.println("                  =====================================\n");
				opcao = sc.nextInt();
				sc.nextLine();
				switch (opcao) {
				case 1:
					System.out.println("Digite seu Nome: ");
					
					nome = sc.nextLine();
					boolean encontro = ((Paciente) paciente).PesquisaNome(nome);
					if(encontro == true) {
						
					}else {
						System.out.println("Paciente n??o Encontrado");
					}
					break;
					
				case 2:
					
					paciente.HistoricoSistema();
					break;
					
				case 0:
					
					break;
				}
				
				
				
				break;
			case 0:
				break;
			default:
				System.out.println("Op????o Inv??lida!");
				break;
			}
		} while (opcao != 0);
		sc.close();

	}

}
