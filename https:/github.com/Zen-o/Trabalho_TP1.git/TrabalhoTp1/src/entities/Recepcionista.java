package entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Recepcionista extends Pessoa{
	private boolean laboratorio;
	ArrayList<Paciente> listaPaciente = new ArrayList<Paciente>();
	
	

	String nome,data,CadUnico;
	Scanner sc = new Scanner(System.in);

	public boolean isLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(boolean laboratorio) {
		this.laboratorio = laboratorio;
	}

	
	
	public void CadastroPaciente(Paciente paciente) {	
		listaPaciente.add(paciente);
	}
	
	@Override
	public void HistoricoSistema() {
		System.out.printf("Registros do Recepcionista %s\n", getNome());
		System.out.printf("Data de Regostrp %s\n", getDataNacimento());
		System.out.println("============================================");
		System.out.println("Pacientes Cadastrados");
		System.out.printf("Nome do Paciente: %s\n",listaPaciente .get(0).getNome());
		System.out.printf("Data do Paciente: %s\n",listaPaciente .get(0).getDataNacimento());
		System.out.printf("Cadastro Unico do Paciente: %s\n",listaPaciente .get(0).getCadastroUnico());
		System.out.printf("CPF: %d\n",listaPaciente .get(0).getCpf());
		System.out.printf("CEP: %d\n",listaPaciente .get(0).getCep());
		System.out.printf("Numero de Telefone: %d\n",listaPaciente .get(0).getTelefone());
				
	}
	

}
