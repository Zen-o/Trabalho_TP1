package entities;

import java.util.ArrayList;

public class Triagem {
    public int id;
    //Paciente paciente = new Paciente(); Código Igor
    
    //Referencia ao objetopaciente associado
    private ArrayList<Paciente> paciente;
    
    
    public void criarPaciente() {
		
    }

    public Triagem(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Paciente> getPaciente() {
        return paciente;
    }

    public void setPaciente(ArrayList<Paciente> paciente) {
        this.paciente = paciente;
    }
        

}
