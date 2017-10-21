/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modularizacion;

/**
 *
 * @author DEVELOPER-SISTEMAS
 */
public class UsoCoche {
    
    
    
    public static void main(String[] args) {
        Coche aveo = new Coche();
        
        
        aveo.definirColor("verde");
        System.out.println(aveo.vercolor());
        aveo.escogeAsientos("si");
        System.out.println(aveo.dime_Asiento());
        aveo.configuraClimatizador("si");
        System.out.println(aveo.verClimatizador());
        System.out.println( aveo.calcularPeso());
        System.out.println("el precio de el coche es " + aveo.calcularPrecio());
    }
}
