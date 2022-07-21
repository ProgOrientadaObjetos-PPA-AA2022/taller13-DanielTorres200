/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author spart
 */
public class OperacionesTelevisores {

    private ArrayList<Televisor> lista;
    private double televisormasCaro;
    private double totalPrecio;
    private String marcasTv = "";
    
    public OperacionesTelevisores(ArrayList<Televisor> t){
        lista = t;
    }
    
    public void establecerTotalPrecioTvs(){
        
        for (int i = 0; i < lista.size(); i++) {
            totalPrecio += lista.get(i).obtenerPrecio();
        }
    }
    
    public void establecerTelevisorMasCaro(){
        televisormasCaro = lista.get(0).obtenerPrecio();
        for (int i = 0; i < lista.size(); i++) {
           if(lista.get(i).obtenerPrecio()> televisormasCaro ){
               televisormasCaro = lista.get(i).obtenerPrecio();
           }
        }
    }
    
    public void establecerListaMarcasVendidas(){
        for (int i = 0; i < lista.size(); i++) {
           marcasTv = String.format("%s%s\n",marcasTv, lista.get(i).obtenerMarca());
        }
    }
    
    public ArrayList<Televisor> obtenerLista() {
        return lista;
    }

    public double obtenerTelevisorMasCaro() {
        return televisormasCaro;
    }

    public double obtenerTotalPrecio() {
        return totalPrecio;
    }

    public String obtenerMarcas() {
        return marcasTv;
    }

    @Override
    public String toString(){
        String cadena = "";
        for (int i = 0; i < lista.size(); i++) {
           cadena = String.format("%s%s", cadena, lista.get(i));
        }
        
        cadena = String.format("%sLista de Marcas\n%s\nTelevisor Mas Caro: %.2f",
                cadena,
                obtenerMarcas(),
                obtenerTelevisorMasCaro());
        
        return cadena;
    }
}
