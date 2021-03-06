package entities;

abstract public class Pessoa {
	
	private String nome, dataNacimento, email;
	private String cpf, cep, telefone;
	public Triagem triagem = new Triagem();
	
	
	
	public Pessoa(String nome, String dataNacimento, String email, String cpf, String cep, String telefone) {
		super();
		this.nome = nome;
		this.dataNacimento = dataNacimento;
		this.email = email;
		this.cpf = cpf;
		this.cep = cep;
		this.telefone = telefone;
		this.triagem = triagem;
	}
	public Pessoa() {
		
	}
	
	
	public String getDataNacimento() {
		return dataNacimento;
	}
	public void setDataNacimento(String dataNacimento) {
		this.dataNacimento = dataNacimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void HistoricoSistema();
	
	
}
