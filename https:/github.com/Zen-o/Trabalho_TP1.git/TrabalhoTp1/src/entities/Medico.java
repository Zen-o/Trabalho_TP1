package entities;

import java.util.ArrayList;

public class Medico extends Pessoa {
	private String crn;
	public Paciente paciente = new Paciente();
	private String atestado, receita,diagnostico;
	ArrayList<Paciente> listaPaciente = new ArrayList<Paciente>();

	public String getCrn() {
		return crn;
	}

	public void setCrn(String crn) {
		this.crn = crn;
	}
	
	
	
	public String getAtestado() {
		return atestado;
	}

	public void setAtestado(String atestado) {
		this.atestado = atestado;
	}

	public String getReceita() {
		return receita;
	}

	public void setReceita(String receita) {
		this.receita = receita;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public void RelatorioPaciente(Paciente paciente){
		listaPaciente.add(paciente);
		paciente.triagem.statusMedico();
	}
	@Override
	public void HistoricoSistema() {
		
	}
	

}
