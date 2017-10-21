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
public class Operadores {
    
    
    public static void main(String[] args) {
        int a = 5;
        int  b;
  final double constante; 
        b =7 ;

        //System.out.println  (a+b+a+b);
        double pi;
        pi = Math.PI;
       double redon;
       redon =Math.round(pi);
       double raiz ;
       raiz = Math.sqrt(36);
       
        
        //System.out.println("esto es "+pi + "mas "+redon + "mas"+raiz );
        Scanner scanner = new Scanner(System.in);
        int valor;
        System.out.println("Ingrese un valor: ");
        valor = scanner.nextInt();
        
        if(valor%2 == 0 )
        {
            System.out.println("es par");
        }else
        {
            System.out.println("no es par");
        }
     
                
      
            
        
     
}
}
