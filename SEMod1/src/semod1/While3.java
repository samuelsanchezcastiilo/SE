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
public class While3 {
    public static void main(String[] args) {
            String genero = "";
    do{
    
    genero = JOptionPane.showInputDialog("Introduce tu genero (H-M)");
    
    }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
    
    int altura = Integer.parseInt(JOptionPane.showInputDialog("introduce la altura en cm "));
    int pesoideal = 0;
    if(genero.equalsIgnoreCase("H"))
    {
        pesoideal = altura-110;
    }else
    {
        pesoideal = altura-120;
    } 
        
    
        System.out.println("Tu peso ideal es "+ pesoideal + " kilos");
    
    }
    

    
}
