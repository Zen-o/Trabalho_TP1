package entities;

public class Pessoa {
	
	private String nome, dataNacimento, email;
	private String cpf, cep, telefone;
	
	public String getDataNacimento() {
		return dataNacimento;
	}
	public String setDataNacimento(String dataDacimento) {
		return dataNacimento;
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
	
	public void HistoricoSistema() {
		
	}
	
}
