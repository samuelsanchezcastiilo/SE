/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semod1;

import javax.swing.JOptionPane;

/**
 *
 * @author DEVELOPER-SISTEMAS
 */
public class While {
    
    
    
    public static void main(String[] args) 
    {
      
        String clave = "sam";
        String contraseña = "" ;
        while (clave.equals(contraseña) !=  true) //se puede decir que clave.equals(contraseña) == false y funcionaria igual
        {            
            contraseña = JOptionPane.showInputDialog("su Contraseñas es :");
            if (clave.equals(contraseña) != true) 
            {
                System.out.println("Clave incorrecta");
            }
        }
        System.out.println("Aseso correcto");
    }
    
}
