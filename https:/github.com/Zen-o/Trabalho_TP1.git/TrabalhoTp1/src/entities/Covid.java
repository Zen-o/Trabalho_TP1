package entities;

public class Covid implements Enfermidade{



	@Override
	public void Sintomas() {
		// TODO Auto-generated method stub
		System.out.println("Febre, falta de Ar, Dor de cabeça, Perda de Oufato e Paladar");
		
		
	}

	@Override
	public void Tratamento() {
		// TODO Auto-generated method stub
		System.out.println("Para tratamento leve");
		System.out.println("Familiar doente deve ficar 10 dias de isolamento contados do início de sintomas"
				+ "       E estar assintomático nas últimas 72 horas;");
		System.out.println("Para tratamento Medio");
		System.out.println("Acompanhamento Medico junto com  medicamentos para tratar os sintomas");
		System.out.println("Para tratamento Grave");
		System.out.println("Internação e Acompanhamento Medico");		
	}
	

}
