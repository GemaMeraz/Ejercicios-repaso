/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosJava;


public class Cuenta {
    
    private String titular;
    private double cantidad;
    
    double cantidadActual=0.0;
    
    public String getTitular()
    {
        return titular;
    }
    
    public void setTitular(String titular)
    {
        this.titular= titular;
        if(titular=="")
        {
            System.out.println("Debe capturar titular");
        }
    }
    
    public double getCantidad()
    {
        return cantidad;
    }
    
    public void setCantidad(double cantidad)
    {
        this.cantidad = cantidad;
    }
    
    // constructores de la clase
    
    public Cuenta (String t)
    {
        t= titular;
        
    }
    
    public Cuenta (String t, double c)
    {
        t=titular;
        c= cantidad;
        cantidad=300;
    }
    
    public String toString()
    {
        // retorna una cadena ta como queremos que se vea la fecha
        return "El saldo total en la cuenta es: "+cantidad;
    }
    
    public void Ingresar(double c)
    {
        if(c<=0.0)
        {
            System.out.println("No se pueden ingresar cantidades negativas");
        }
        else
        {
            System.out.println("Se ha ingresado la cantidad: "+ c);
            cantidad=cantidad+ c;
        }
        
    }
    
    public void Retirar(double r)
    {
        cantidad=cantidad-r;
        
        if(cantidad<=0.0)
        {
            cantidad=0;
            System.out.println("La cantidad en la cuenta es : "+cantidad);
        }
        else
        {
            System.out.println("Se ha retirado y el saldo a avor es: "+ cantidad);
            
        }
    }
    
}
