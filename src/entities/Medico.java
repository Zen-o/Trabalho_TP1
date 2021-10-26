package entities;

import java.util.ArrayList;
//Olá
public class Medico extends Pessoa {
	private String crn;
	ArrayList<Pessoa> listaPaciente = new ArrayList<>();

    public Medico(String nome, String dataNacimento, String email, String cpf, String cep, String telefone,String crn) {
        super(nome, dataNacimento, email, cpf, cep, telefone);
        this.crn = crn;
    }

	public String getCrn() {
		return crn;
	}

	public void setCrn(String crn) {
		this.crn = crn;
	}
	
	public void AddPaciente(Pessoa paciente) {
		listaPaciente.add(paciente);
	
	}
	public void AddTriagem(float temperatura, float oxigenio) {
		int flag = 0;
		for(Pessoa list: listaPaciente) {
			if(listaPaciente.get(flag).triagem.getTemperatura() == 0) {
				listaPaciente.get(flag).triagem.setTemperatura(temperatura);
			}
			if(listaPaciente.get(flag).triagem.getOxigenio()== 0) {
				listaPaciente.get(flag).triagem.setOxigenio(oxigenio);
			}
		
			
			
			flag = flag + 1;
			
		}
	}
	
	public boolean PesquisaNome(String nome) {
		int flag = 0;
	
		for(Pessoa list: listaPaciente) {
				if(listaPaciente.get(flag).getNome().equals(nome)) {
					System.out.println("Ficha do Paciente:");
					System.out.printf("Nome do Paciente: %s\n",listaPaciente.get(flag).getNome());
					System.out.printf("Temperatura Corporal: %.2f\n",listaPaciente.get(flag).triagem.getTemperatura());
					System.out.printf("Nivel de Oxigenio: %.2f\n",listaPaciente.get(flag).triagem.getOxigenio());
					System.out.printf("Resultado do teste:");
					System.out.println(((Paciente) listaPaciente.get(flag)).isTesteCovid());

					return true;
					
				}
				flag = flag + 1;
				
			}
		return false;
			
		
	}
	
	public void TratamentoMedico() {
		
	}
	@Override
	public void HistoricoSistema() {
		System.out.println("Area do Medico");
		System.out.println("Pacientes Atendidos: ");
		int cont = 0;
		for(Pessoa list: listaPaciente) {
			
			System.out.printf("Nome do Paciente: %s\n",listaPaciente.get(cont).getNome());
			System.out.printf("CPF: %s\n",listaPaciente.get(cont).getCpf());
			System.out.printf("Cadastro Unico: %s\n",((Paciente) listaPaciente.get(cont)).getCadastroUnico());
			System.out.printf("Temperatura Corporal: %.2f\n",listaPaciente.get(cont).triagem.getTemperatura());
			System.out.printf("Nivel de Oxigenio: %.2f\n",listaPaciente.get(cont).triagem.getOxigenio());
			
			cont = cont + 1;
		}
		
		
	}
	

}
