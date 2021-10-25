package entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Recepcionista extends Pessoa{

	ArrayList<Pessoa> listaPaciente = new ArrayList<>();
	Pessoa sPaciente = new Paciente();
	int cont = 0;

	
	Scanner sc = new Scanner(System.in);

	
	public void Cadastro(Pessoa paciente) {
		
		listaPaciente.add(paciente);	
	}
	
	
	@Override
	public void HistoricoSistema() {
		System.out.printf("Registros do Recepcionista %s\n", getNome());
		System.out.printf("Data de Registro %s\n", getDataNacimento());
		System.out.println("============================================");
		System.out.println("Pacientes Cadastrados");
		/*
		for(Pessoa list: listaPaciente) {
			System.out.println(cont);
			System.out.printf("Nome do Paciente: %s\n",listaPaciente.get(cont).getNome());
			System.out.printf("Telefone: %s\n",listaPaciente.get(cont).getDataNacimento());
			System.out.printf("CPF: %s\n",listaPaciente.get(cont).getCpf());
			System.out.printf("Cadastro Unico: %s\n",((Paciente) listaPaciente.get(cont)).getCadastroUnico());
			System.out.println(cont);
			cont = cont + 1;
		}
		*/
		
		System.out.printf("Nome do Paciente: %s\n",listaPaciente.get(0).getNome());
		System.out.printf("Telefone: %s\n",listaPaciente.get(0).getDataNacimento());
		System.out.printf("CPF: %s\n",listaPaciente.get(0).getCpf());
		System.out.printf("Cadastro Unico: %s\n",((Paciente) listaPaciente.get(0)).getCadastroUnico());
		

		System.out.printf("Nome do Paciente: %s\n",listaPaciente.get(1).getNome());
		System.out.printf("Telefone: %s\n",listaPaciente.get(1).getDataNacimento());
		System.out.printf("CPF: %s\n",listaPaciente.get(1).getCpf());
		System.out.printf("Cadastro Unico: %s\n",((Paciente) listaPaciente.get(1)).getCadastroUnico());
		
		
				
	}
	

}
