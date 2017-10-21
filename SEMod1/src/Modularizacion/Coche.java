/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modularizacion;

/**
 *
 * @author DEVELOPER-SISTEMAS
 */
public class Coche {
    
    protected int ruedas;
    private int ancho;
    private int largo;
    private int motor;
    private int pesoPlataforma;
    String color;
    int pesoTotal;
    boolean asientos_cuero,climatizador;

    public Coche() {
      ruedas = 4;
      ancho = 200;
      largo = 1500;
      motor = 1800;    
      pesoPlataforma = 500;
    }
    
    public void definirColor(String color_coche)//SETTER
    {
        this.color = color_coche;
    }
    
    public String vercolor()
    {
        return "el color de el coche es "+ color;
    }
    
    public void escogeAsientos(String asientos_cueros)
    {
        if (asientos_cueros == "si") 
        {
            this.asientos_cuero=true;
        }else
        {
            this.asientos_cuero =false;
        }
    }
        
    public String dime_Asiento()
    {
        if(asientos_cuero == true)
        {
            return  "si tiene asientos de cueros";
        }
        else
        {
        return "no tendra asientos de cuero";
        }
    }
    
    public void configuraClimatizador(String climatizador)//setter
    {
        if(climatizador == "si")
        {
            this.climatizador = true;
        }else
        {
            this.climatizador = false;
        }
    }
    
    public String verClimatizador()//getter
    {
        if(climatizador == true)
        {
            return "si tiene climatizador";
        }else
        {
            return "no lo tiene solo tiene aire";
        }    
    }
    
    public String calcularPeso() //setter y getter
    {
        int peso_carroceria = 500;
        pesoTotal = pesoPlataforma+peso_carroceria;
        if(asientos_cuero)
        {
            pesoTotal+=50;
        }
        if(climatizador)
        {
            pesoTotal+= 20;
        }
        return "el peso del coches es "+ pesoTotal;
    }
    
    public int calcularPrecio()
    {
        int precioFinal = 10000;
        
        if(asientos_cuero)  precioFinal+=1000;
            
        if(climatizador) precioFinal+=1500;
        
        return precioFinal;
    }
}
