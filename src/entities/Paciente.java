package entities;

import java.util.ArrayList;

public class Paciente extends Pessoa{
	private String cadastroUnico;
	public Triagem triagem = new Triagem();
	private boolean testeCovid;
	ArrayList<Pessoa> listaPaciente = new ArrayList<>();

	

	public boolean isTesteCovid() {
		return testeCovid;
	}



	public void setTesteCovid(boolean testeCovid) {
		this.testeCovid = testeCovid;
	}
	

	public String getCadastroUnico() {
		return cadastroUnico;
	}

	

	public Paciente(String cadastroUnico) {
		super();
		this.cadastroUnico = cadastroUnico;
	}
	public Paciente(String nome, String data, String email, String cpf, String cep, String telefone, String cadastroUnico) {
		setNome(nome);
		setDataNacimento(data);
		setEmail(email);
		setCpf(cpf);
		setCep(cep);
		setTelefone(telefone);
		setCadastroUnico(cadastroUnico);
		
	}
	public Paciente(String nome, String data, String email, String cpf, String cep, String telefone, String cadastroUnico,boolean covid) {
		setNome(nome);
		setDataNacimento(data);
		setEmail(email);
		setCpf(cpf);
		setCep(cep);
		setTelefone(telefone);
		setCadastroUnico(cadastroUnico);
		setTesteCovid(covid);
		
	}
	
	public Paciente(String nome, String cpf, String cadastroUnico,boolean covid) {
		setNome(nome);
		setCpf(cpf);
		setCadastroUnico(cadastroUnico);
		setTesteCovid(covid);
	
		
	}
	public Paciente() {
		
	}



	public void setCadastroUnico(String cadastroUnico) {
		this.cadastroUnico = cadastroUnico;
	}

	@Override
	public void HistoricoSistema() {

		int cont = 0;
		for(Pessoa list: listaPaciente) {
			
			System.out.printf("Nome do Paciente: %s\n",listaPaciente.get(cont).getNome());
			System.out.printf("CPF: %s\n",listaPaciente.get(cont).getCpf());
			System.out.printf("Cadastro Unico: %s\n",((Paciente) listaPaciente.get(cont)).getCadastroUnico());
			System.out.println("Ficha do Paciente:");
			System.out.printf("Nome do Paciente: %s\n",listaPaciente.get(cont).getNome());
			System.out.printf("Telefone: %s\n",listaPaciente.get(cont).getDataNacimento());
			System.out.printf("CPF: %s\n",listaPaciente.get(cont).getCpf());
			System.out.printf("Cadastro Unico: %s\n",((Paciente) listaPaciente.get(cont)).getCadastroUnico());
			System.out.printf("Temperatura Corporal: %.2f\n",listaPaciente.get(cont).triagem.getTemperatura());
			System.out.printf("Nivel de Oxigenio: %.2f\n",listaPaciente.get(cont).triagem.getOxigenio());
			System.out.printf("Resultado do teste:");
			System.out.println(((Paciente) listaPaciente.get(cont)).isTesteCovid());

			cont = cont + 1;
		}
	

		
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
					System.out.printf("Telefone: %s\n",listaPaciente.get(flag).getDataNacimento());
					System.out.printf("CPF: %s\n",listaPaciente.get(flag).getCpf());
					System.out.printf("Cadastro Unico: %s\n",((Paciente) listaPaciente.get(flag)).getCadastroUnico());
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




	

}
