package entities;

import java.util.Random;

public class Laboratorio {
	public boolean testeCovid;
	Random gerador = new Random();

	
	
	public void Exame(Paciente paciente) {
		testeCovid = true;
		int num = gerador.nextInt(100);
	
		if(paciente.triagem.getNivelGravidade() == 1) {
			
			if(num >= 30) {
				testeCovid = false;
			}
		}
		if(paciente.triagem.getNivelGravidade() == 2) {
			if(num >= 40) {
			testeCovid = false;
			}
		}
		if(paciente.triagem.getNivelGravidade() == 3) {
			if(num >= 70) {
			testeCovid = false;
			}
		}
		if(paciente.triagem.getNivelGravidade() == 4) {
			if(num >=90) {
			testeCovid = false;
			}
		}
	}
}
