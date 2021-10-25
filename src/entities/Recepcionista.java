package entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Recepcionista extends Pessoa{

	ArrayList<Pessoa> listaPaciente = new ArrayList<>();
	int cont = 0;

	
	Scanner sc = new Scanner(System.in);

	
	public void Cadastro(Pessoa paciente) {
		listaPaciente.add(paciente);	
	}
	
	public boolean PesquisaNome(String nome) {
		int flag = 0;
		for(Pessoa list: listaPaciente) {
				if(listaPaciente.get(flag).getNome().equals(nome)) {
					System.out.println("Paciente encontrado:");
					System.out.printf("Nome do Paciente: %s\n",listaPaciente.get(flag).getNome());
					System.out.printf("Telefone: %s\n",listaPaciente.get(flag).getTelefone());
					System.out.printf("CPF: %s\n",listaPaciente.get(flag).getCpf());
					System.out.printf("Cadastro Unico: %s\n",((Paciente) listaPaciente.get(flag)).getCadastroUnico());
					return true;
					
				}
				flag = flag + 1;
				
			}
		return false;
			
		
	}
	
	@Override
	public void HistoricoSistema() {
		System.out.printf("Registros do Recepcionista %s\n", getNome());
		System.out.printf("Data de Registro %s\n", getDataNacimento());
		System.out.println("============================================");
		System.out.println("Pacientes Cadastrados");
		
		for(Pessoa list: listaPaciente) {
			
			System.out.printf("Nome do Paciente: %s\n",listaPaciente.get(cont).getNome());
			System.out.printf("Telefone: %s\n",listaPaciente.get(cont).getDataNacimento());
			System.out.printf("CPF: %s\n",listaPaciente.get(cont).getCpf());
			System.out.printf("Cadastro Unico: %s\n",((Paciente) listaPaciente.get(cont)).getCadastroUnico());
			System.out.println(cont);
			cont = cont + 1;
		}
				
	}
	

}
