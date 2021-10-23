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
		System.out.printf("Nome do Paciente %s", paciente.getNome());
		System.out.println("-----------Triagem---------------");
		System.out.printf("Temperatura: %f\n", paciente.triagem.getTemperatura());
		System.out.printf("Oxigenio: %f\n", paciente.triagem.getOxigenio());
		System.out.printf("Gravidade: %d",paciente.triagem.getNivelGravidade());
		System.out.println("Resultado do exame covid:");
		paciente.laboratorio.Exame(paciente);
		boolean exame = paciente.laboratorio.testeCovid;
		System.out.println(exame);
	}
	public void TratamentoMedico() {
		
	}
	@Override
	public void HistoricoSistema() {
		System.out.println("Area do Medico");
		System.out.println("Pacientes Atendidos: ");
		
		
	}
	

}
