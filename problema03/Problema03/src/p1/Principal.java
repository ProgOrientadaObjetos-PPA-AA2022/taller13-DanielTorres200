/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;
import p2.Estudiante;
import p3.Correo;
import p3.DominioGmail;
import p3.DominioGobierno;
import p3.DominioOutlook;
import p3.DominioUtpl;
import p3.DominioYahoo;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*
        El mini-sistema debe permitir que se genere
        diversos correos para un estudiante.
        Para Gmail
        Para Outlook
        Para Yahoo
        Para utpl.edu.ec
        Para gobiernoec.gob
        
         */

        Estudiante e = new Estudiante();
        e.establecerNombres("René Elizalde");
        e.establecerUserName("rrelizalde");
        ArrayList<Correo> lista = new ArrayList<>();

        DominioGmail dominio = new DominioGmail();
        dominio.establecerDominio("gmail.com");
        Correo c = new Correo();
        c.establecerDominio(dominio);
        c.establecerUserName(e.obtenerUserName());
        c.establecerCorreo();

        DominioOutlook dominio1 = new DominioOutlook();
        dominio1.establecerDominio("Outlook.com");
        Correo c1 = new Correo();
        c1.establecerDominio(dominio1);
        c1.establecerUserName(e.obtenerUserName());
        c1.establecerCorreo();

        DominioYahoo dominio2 = new DominioYahoo();
        dominio2.establecerDominio("yahoo.com");
        Correo c2 = new Correo();
        c2.establecerDominio(dominio2);
        c2.establecerUserName(e.obtenerUserName());
        c2.establecerCorreo();

        DominioUtpl dominio3 = new DominioUtpl();
        dominio3.establecerDominio("utpl.edu.ec");
        Correo c3 = new Correo();
        c3.establecerDominio(dominio3);
        c3.establecerUserName(e.obtenerUserName());
        c3.establecerCorreo();

        DominioGobierno dominio4 = new DominioGobierno();
        dominio4.establecerDominio("gobiernoec.gob");
        Correo c4 = new Correo();
        c4.establecerDominio(dominio4);
        c4.establecerUserName(e.obtenerUserName());
        c4.establecerCorreo();

        lista.add(c);
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        lista.add(c4);

        e.establecerCorreos(lista);

        System.out.printf("%s\n", e);

    }
}
