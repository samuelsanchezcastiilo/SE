/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractatas;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author DEVELOPER-SISTEMAS
 */
public class UsoPersona {
    public static void main(String[] args) {
        Persona[] lasPersonas =  new Persona[2];
        lasPersonas[0]= new Empleado2("samuelabs", 73700, 2019, 10, 15);
        lasPersonas[1] = new Alumno("jeremias","sistemas");
        
        for(Persona p : lasPersonas)
        {
            System.out.println(p.dameNombre() + p.dameDescripcion());
        }
    }
}

abstract  class Persona
{
    public Persona(String nom)
    {
        nombre = nom;
    }
    public  String dameNombre()
    {
        return nombre;
    }
    public abstract String dameDescripcion();
    private String nombre;
}
class Empleado2 extends Persona{
      
      private String nombre;
      private double sueldo;
      private Date altaContrato;
      private static int IdSiguieente;
      private int id;
    
    public Empleado2(String nom ,double suel, int anno,int mes, int dia)
    {
        super(nom);
        this.nombre = nom;
        this.sueldo = suel;
        GregorianCalendar calendar = new GregorianCalendar(anno,mes-1,dia);
        this.altaContrato = calendar.getTime();
        ++IdSiguieente;
        id = IdSiguieente;
        
    }
    public String dameDescripcion()
    {
        
        return "Este empleado tiene in id: "+ id + "con un sueldo: " + sueldo;
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

class Alumno extends Persona
{
    public Alumno(String nom,String car)
    {
        super(nom);
        carrera = car;
    }
    public String dameDescripcion()
    {
        return "Este alumno esta estudiando la carrera de "+ carrera;
    }
    private String carrera;
           
}