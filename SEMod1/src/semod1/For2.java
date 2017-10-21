/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semod1;

import javax.swing.JOptionPane;

/**
 *
 * @author developer
 */
public class For2 {
    
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        int factorial = 1;
        for (int i = numero ; i < 0; i --){
            System.out.println("esto es numero" +i);
            factorial = factorial * i;
        }
        System.out.println("el factorial de i es: " + factorial);
    }
    
}
