/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.util.Date;
import java.util.GregorianCalendar;


/**
 *
 * @author developer
 */
public class UsoEmpleado {
    
    
    
    
    public static void main(String[] args) {
        //Empleado empleado = new Empleado("sameul", 737000, 2017, 02, 02);
        //empleado.subeSueldo(5);
        //System.out.println(empleado.dameNombre() + empleado.dameSueldo() +empleado.dameFechaContrato());
        
        Empleado [] misEmpleados  = new Empleado[4];
        misEmpleados[0]= new Empleado("sameul",  737000, 2017, 02, 02);
        misEmpleados[1]= new Empleado("sameul2", 837000, 2017, 02, 02);
        misEmpleados[2]= new Empleado("sameul3", 937000, 2017, 02, 02);
        misEmpleados[3] = new Empleado("samuel11");
        

        
        for(Empleado e: misEmpleados) 
        {
            e.subeSueldo(5);
            System.out.println("Nombre: "+ e.dameNombre() + "  Sueldo "+
            e.dameSueldo() + "  Fecha Contrato: "+ e.dameFechaContrato());
        }
       
    }
}



class Empleado{
      
      private String nombre;
      private double sueldo;
      private Date altaContrato;
    
    public Empleado(String nom ,double suel, int anno,int mes, int dia)
    {
        this.nombre = nom;
        this.sueldo = suel;
        GregorianCalendar calendar = new GregorianCalendar(anno,mes-1,dia);
        this.altaContrato = calendar.getTime();
    }
    public Empleado(String nom)
    {
        nombre=nom;
    }
    public  String dameNombre()//getter
    {
        return nombre;
    }
    public double dameSueldo()//getter
    {
        return sueldo;
    }
    public Date dameFechaContrato()//getter
    {
        return altaContrato;
    }
    
    public  void subeSueldo(double porcentaje)
    {
        double auemento = sueldo*porcentaje/100;
        sueldo += auemento;
    }
  
}