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
        
        Jefes jefeSistemas = new Jefes("samuel",737000, 2017,2,20);
        jefeSistemas.estableceIncetivo(10000);
        
        Empleado [] misEmpleados  = new Empleado[6];
        misEmpleados[0]= new Empleado("sameul",  737000, 2017, 02, 02);
        misEmpleados[1]= new Empleado("sameul2", 837000, 2017, 02, 02);
        misEmpleados[2]= new Empleado("sameul3", 937000, 2017, 02, 02);
        misEmpleados[3] = new Empleado("samuel11");
        misEmpleados[4] = jefeSistemas;//polimorfismo en accion principo de sustitucion;
        misEmpleados[5]  = new Jefes("samueljefe", 90000, 2010, 05, 20); //mas polimorfismo en accion
        Jefes jefe = (Jefes) misEmpleados[5]; //refundicion de objetos en la herencia 
        jefe.estableceIncetivo(20000);

        
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
      private static int IdSiguieente;
      private int id;
    
    public Empleado(String nom ,double suel, int anno,int mes, int dia)
    {
        this.nombre = nom;
        this.sueldo = suel;
        GregorianCalendar calendar = new GregorianCalendar(anno,mes-1,dia);
        this.altaContrato = calendar.getTime();
        ++IdSiguieente;
        id = IdSiguieente;
        
    }
    public Empleado(String nom)
    {

        this(nom, 10, 2010, 02, 20);
    }
    public  String dameNombre()//getter
    {
        return nombre +" id "+id;
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