/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosJava;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class TestCuenta {
    public static void main(String[] args)
    {
        String nombre="";
        double cantidad=300;
        String r="si", i="si",volverIngresar="si";
        Scanner scanner = new Scanner(System.in);
        
       do{
         System.out.println("Ingrese el nombre del titular de la cuenta");
        nombre = scanner.next();
//        System.out.println("Ingrese cantidad a la cuenta");
//        cantidad = scanner.nextDouble();
        
        Cuenta miCuenta = new Cuenta(nombre);
        Cuenta miCuenta2 = new Cuenta(nombre, cantidad);
        
        
        do
        {
            System.out.println("¿Desea ingresar dinero? (si o no): ");
             r=scanner.next();
             
            if("si".equals(r))
           {
               System.out.println("Ingrese la cantidad");
               miCuenta2.Ingresar(scanner.nextDouble());
           }
            
        
           System.out.println("¿Desea retirar dinero? (si o no): ");
           i=scanner.next();
               if("si".equals(i))
                {
                    System.out.println("Ingrese la cantidad a retirar" );
                    miCuenta2.Retirar(scanner.nextDouble());
                }
            
        }
        while(r=="si"&&i=="si");
        
        miCuenta.toString();
        
        System.out.println("¿Desea ingresar un nuevo tiular? (si o no): ");
        volverIngresar= scanner.next();
       }
       while("si".equals(volverIngresar));
           
        
        
       
        
        
        
        
    }
}
