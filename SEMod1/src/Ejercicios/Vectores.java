/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author developer
 */


public class Vectores {
    
    public static void main(String[] args) {
        
        VectoresParalelos vectorpParalelos  =  new VectoresParalelos(5);
        vectorpParalelos.asignarDatos();
        
        
    }
    
    
}
/*los vectores paralelos se dan cuando hay una relacon entre 
los componetentes de igual subindice ejmp tenemos dos vectores 
en uno almacenamos los nombres y en otro las edades*/
class VectoresParalelos
{
     private Scanner scanner;
    
   
    
    public  VectoresParalelos(int tamanoVector) // craemos el contructor 
    {
      edades =  new int[tamanoVector];
      nombre =  new String[tamanoVector];
      asignarDatos();
    }
    
    public void asignarDatos()
    {
       scanner =  new Scanner(System.in);
        for (int i = 0; i < nombre.length; i++) {
             System.out.println("Ingrese el  Nombre: " + (i+1) );
             nombre[i] = scanner.next();
             System.out.println("Ingrese la edad de: "+ nombre[i]);
             edades[i] = scanner.nextInt();
        }
        obtenerArray();
      
    }
    
    public void obtenerArray()
    {
        for (int i = 0; i < edades.length; i++) {
            
             System.out.println("el estudiante: " + nombre[i] + "tiene: " + edades[i]);
             System.out.println();
        }
        mayoresEdad();
    }
    public void mayoresEdad()
    {
        for (int i = 0; i < edades.length; i++) {
                if(edades[i] >= 18)
                {
                    System.out.println(nombre[i] + " Es mayor de edad");
                }else
                {
                    System.out.println(nombre[i] + " No es mayor de edad");
                }
            
        }
    }

    private int  edades[] ;
    private String  nombre[];
}
