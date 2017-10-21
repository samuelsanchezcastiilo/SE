/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semod1;


/**
 *
 * @author developer
 */
public class Porcentaje {
    
    public static void main(String[] args) {
        
        final int minutos = 25;
        int totalTutorias = 268;
        int vistos = 37;
        
        
        int tutorialesFaltantes = totalTutorias -vistos;
        int minutosTotales = totalTutorias*minutos;
        int minutosVistos = vistos * minutos;
        int porcentajeVisto = (vistos*100)/totalTutorias;
        int minutosRestantes = minutosTotales - minutosVistos;
        int horasVistas  = minutosVistos/60;
        int horasPorVer = (minutosTotales/60)-horasVistas;
        int totalHoras = minutosTotales/60;
        
        //System.out.println("las horas restantes son " + minutosRestantes/60);
       System.out.println("Le faltan " +tutorialesFaltantes + " videos por ver\nesto"
        + " con un porcentaje de "+ porcentajeVisto +"%"+ "\na visto un total de "
                + minutosVistos +" minutos en videos\nlo que corresponde a "+horasVistas+" horas\n"
                        + "a le quedan "+minutosRestantes+""
                        + " minutos por ver \n lo que corresponde a "+horasPorVer+
               " horas");
        System.out.println("esto es horas totaes"+totalHoras);
                
        //para sacar el 100% es valor total x 
        
    }
    
}
