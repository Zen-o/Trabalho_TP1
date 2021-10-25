package entities;


public class Paciente extends Pessoa{
	private String cadastroUnico;
	public Triagem triagem = new Triagem();
	public Laboratorio laboratorio = new Laboratorio();
	public String exameResultado;


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
	
	public Paciente(String nome, String cpf, String cadastroUnico) {
		setNome(nome);
		setCpf(cpf);
		setCadastroUnico(cadastroUnico);

	
		
	}
	public Paciente() {
		
	}



	public void setCadastroUnico(String cadastroUnico) {
		this.cadastroUnico = cadastroUnico;
	}

	@Override
	public void HistoricoSistema() {
		System.out.println("Ficha Paciente");
		System.out.printf("Nome Paciente: %s\n", getNome());
		System.out.printf("Data de Nascimento: %s\n", getDataNacimento());
		System.out.printf("Cadastro Unico: %s\n", cadastroUnico);
		if(triagem.getNivelGravidade() == 1) {
			System.out.println("Orientação, Quarentena e Teste Covid");
		}else if(triagem.getNivelGravidade() == 2) {
			System.out.println("Orientação, Medicamento e Teste Covid");
		}else if(triagem.getNivelGravidade() == 3) {
			System.out.println("Orientação, Medico e Teste Covid");
		}else if(triagem.getNivelGravidade() == 4) {
			System.out.println("Internação, Medico e Teste Covid");
		}
	

		
	}
	

	

}
