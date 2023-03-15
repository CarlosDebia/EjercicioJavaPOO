/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Libro;

/**
 *
 * @author cdb
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro(12343456, "Don quijote de la mancha", "Cervantes", 1000);
        System.out.println(libro1.mostrar());

    }
    
}
