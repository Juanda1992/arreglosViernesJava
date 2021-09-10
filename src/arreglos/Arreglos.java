/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;
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
    
    
   /* numeros[0]=10;
    numeros[1]=20;
    numeros[2]=30;
    numeros[3]=40;
    numeros[4]=50;
    
    System.out.println(numeros[0]);
    System.out.println(numeros[1]);
    System.out.println(numeros[2]);
    System.out.println(numeros[3]);
    System.out.println(numeros[4]);*/
    
    
       // for (int i = 0; i < 5; i++) {
         //   System.out.println(i);  
        //}
         Scanner entrada = new Scanner(System.in);
         int[] numeros= new int[5];
        
        for(int i=0; i<numeros.length;i++){
            System.out.println("");
            int [] numeros
        }
    
           for(int i=0; i<numeros.length;i++){
            System.out.println("Digita un numero: ");
        }
    
    Heroe heroe = new Heroe();
    Enemigo enemigo = new Enemigo();
    
    //Accediendo a atributos
    enemigo.nombre="Borja";
    heroe.nombre="Lucho dias";
       
        
    //Accediendo a un atributo privado
    heroe.setEdad(-5);
    
    //Imprimo valores
    //System.out.println(heroe.getEdad());
    //System.out.println(heroe.nombre);
    }
}

