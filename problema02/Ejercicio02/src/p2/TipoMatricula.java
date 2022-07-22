/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p1.Matricula;

/**
 *
 * @author reroes
 */
public class TipoMatricula {

    private double promedioMatriculas;
    private ArrayList<Matricula> lista;

    public void establecerLista(ArrayList<Matricula> c) {
        lista = c;
    }

    public ArrayList<Matricula> obtenerLista() {
        return lista;
    }

    public void establecerPromedioTarifas() {
        double suma = 0;
        for (Matricula c : lista) {
            suma += c.obtenerTarifa();
        }
        promedioMatriculas = suma / lista.size();
    }

    public double obtenerPromedioTarifas() {
        return promedioMatriculas;
    }

    @Override
    public String toString() {
        String cadena = "";
        for (Matricula m : lista) {
            cadena = String.format("%s%s", cadena, m);
        }
        cadena = String.format("%sPromedio Tarifas: $ %.2f", 
                cadena,
                obtenerPromedioTarifas());
        return cadena;
    }
}
