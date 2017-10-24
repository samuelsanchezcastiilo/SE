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
public class Enume{

    
    //ejemplo de las tallas
    
   
    enum Talla
    {
         MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");
     private Talla(String abreviatura)
     {
       this.abreviatura = abreviatura;
     }
     public String DameTalla()
     {
         return abreviatura;
     }
     private String abreviatura;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una talla");
        String datos = scanner.next().toUpperCase();
        Talla talla = Enum.valueOf(Talla.class, datos);
        System.out.println("la talla es " +talla.abreviatura);
    }
    
    
}
