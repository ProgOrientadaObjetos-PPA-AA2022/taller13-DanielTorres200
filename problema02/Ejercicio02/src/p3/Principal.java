/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
import p2.TipoMatricula;
import java.util.ArrayList;
import p1.Matricula;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Matricula> mat = new ArrayList<>();
        TipoMatricula tiposM = new TipoMatricula();
        
        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerTarifa();
        mat.add(mcamp);
        
        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerTarifa();
        mat.add(mcolegio);
        
        MatriculaEscuela mescuela = new MatriculaEscuela();
        mescuela.establecerTarifa();
        mat.add(mescuela);
        
        MatriculaJardin mjardin = new MatriculaJardin();
        mjardin.establecerTarifa();
        mat.add(mjardin);
        
        MatriculaMaternal mmaternal = new MatriculaMaternal();
        mmaternal.establecerTarifa();
        mat.add(mmaternal);
        
        MatriculaMaternal mmaternal2 = new MatriculaMaternal();
        mmaternal2.establecerTarifa();
        mat.add(mmaternal2);
        
        tiposM.establecerLista(mat);
        tiposM.establecerPromedioTarifas();
        System.out.printf("%s\n", tiposM);
    }
}
