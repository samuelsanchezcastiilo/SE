/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author developer
 */
final  class  Jefes extends Empleado
{
   
    public  Jefes(String nom,double sueldo , int ano,int mes ,int dia)
    {
        super(nom,sueldo,ano,mes,dia);
    }
    
    public void estableceIncetivo(double b)
    {
        incentivo = b;
    }
    public double dameSueldo()
    {
        double sueldoJefe=super.dameSueldo();
        return incentivo+sueldoJefe;
    }
    private double incentivo;
   
}
