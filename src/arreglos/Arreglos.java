/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import paquete2.Heroe;

/**
 *
 * @author 503
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int edad =50;
    Heroe heroe = new Heroe();
    Enemigo enemigo = new Enemigo();
    
    //Accediendo a atributos
    enemigo.nombre="Borja";
    heroe.nombre="Lucho dias";
       
        
    //Accediendo a un atributo privado
    heroe.setEdad(-5);
    
    //Imprimo valores
    System.out.println(heroe.getEdad());
    System.out.println(heroe.nombre);
    }
}

