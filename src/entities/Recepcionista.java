package entities;

public class Recepcionista extends Pessoa{
	private boolean laboratorio, triagem;

	public boolean isLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(boolean laboratorio) {
		this.laboratorio = laboratorio;
	}

	public boolean isTriagem() {
		return triagem;
	}

	public void setTriagem(boolean triagem) {
		this.triagem = triagem;
	}
	

}
