/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class Dados {
    private static ArrayList<Paciente> listaPacientes;
    private static ArrayList<Recepcionista> listaRecepcionistas;
    private static ArrayList<Medico> listaMedicos;

    public static ArrayList<Paciente> getListaPacientes() {
        if (listaPacientes == null)
            listaPacientes = new ArrayList<Paciente>();
        return listaPacientes;
    }

    public static void adicionarPaciente(Paciente paciente) {
        Dados.listaPacientes.add(paciente);
    }

    public static ArrayList<Recepcionista> getListaRecepcionistas() {
        if (listaRecepcionistas == null)
            listaRecepcionistas = new ArrayList<Recepcionista>();
        return listaRecepcionistas;
    }

    public static void adicionarRecepcionista(Recepcionista recepcionista) {
        Dados.listaRecepcionistas.add(recepcionista);
    }

    public static ArrayList<Medico> getListaMedicos() {
        if (listaMedicos == null)
            listaMedicos = new ArrayList<Medico>();
        return listaMedicos;
    }

    public static void adicionarMedico(Medico medico) {
        Dados.listaMedicos.add(medico);
    }  
}
