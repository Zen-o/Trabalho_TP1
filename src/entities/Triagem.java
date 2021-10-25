package entities;



public class Triagem {
	
	private float temperatura, pressao, oxigenio;
	public boolean paladar,oufato;
	private int nivelGravidade;
	
	
	
	 
	
	public Triagem(float temperatura, float oxigenio) {
		super();
		this.temperatura = temperatura;
		this.oxigenio = oxigenio;
	}
	

	public Triagem() {
		
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public float getOxigenio() {
		return oxigenio;
	}

	public void setOxigenio(float oxigenio) {
		this.oxigenio = oxigenio;
	}

	public int getNivelGravidade() {
		return nivelGravidade;
	}

	public void setNivelGravidade(int nivelGravidade) {
		this.nivelGravidade = nivelGravidade;
	}

	public float getPressao() {
		return pressao;
	}

	public void setPressao(float pressao) {
		this.pressao = pressao;
	}
	
	public void statusMedico() {
		if(temperatura >= 37.1 && temperatura <= 37.8  && oxigenio>= 91 && oxigenio <= 99 && oufato == false && paladar == false) {
			nivelGravidade = 1;
			
			
		}else if(temperatura >= 38.1 && temperatura <= 38.8   && oxigenio>= 91 && oxigenio <= 99 && oufato == false && paladar == true) {
			nivelGravidade = 2;
			
		}else if(temperatura >= 38.9 && temperatura <= 39.5   && oxigenio >= 91 && oxigenio <= 99 && oufato == true && paladar == true) {
			nivelGravidade = 3;
			
		}
		else if(temperatura > 39.5 && oxigenio <= 90 && oufato == true && paladar == true) {
			nivelGravidade = 4;
			
		}
	}
	
	
	

	

}
