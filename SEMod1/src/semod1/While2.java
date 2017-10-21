/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semod1;

import java.util.Scanner;

/**
 *
 * @author developer
 */
public class While2 {
    
    public static void main(String[] args) {
        
        int aleatorio = (int) (Math.random()*100);
        int numero = 0 ;
        int intentos = 0 ;
        Scanner sc =  new Scanner(System.in);
        
        while(numero != aleatorio)
        {
            intentos ++;
            System.out.println("Introduce un numero  por favor");
            numero  = sc.nextInt();
            
            if(numero < aleatorio)
            {
                System.out.println("El numero es mas alto");
            }else if(numero > aleatorio)
                    {
                        System.out.println("El numero es mas bajo");
                    }
            
        }
        System.out.println("Correcto adivinaste en : "+ intentos + " intentos");
    }
    
}
