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
public class For1 {
    
  
    public static void main(String[] args) {
        
       /*String nombre = "samuel";
       String nombre2 = "";
        
        for (int i = 0; i < nombre.length(); i++) {
            System.out.println("la letra "+i+" es "+nombre.charAt(i));
            nombre2+=nombre.charAt(i);
            
        }
        System.out.println("nombre "+ nombre2);*/
       String correo =JOptionPane.showInputDialog("ingrese su correo por favor");
       boolean caracter = false;
       int caracter2 = 0;
       
        for (int i = 0; i < correo.length(); i++) {
            if(correo.charAt(i)=='.')
            {
                caracter = true;
                
            }
            if(correo.charAt(i) == '@')
            {
                caracter2++;
            }
        }
        if (caracter == true && caracter2 ==1) 
        {
            System.out.println("Es correcto");    
        }else
        {
            System.out.println("Incorrecto");
        }
       
       
        
    }
    
}
