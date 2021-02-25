/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibroUnidad1_Ejercicios;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class NumerosIguales {
    public static void main(String[] args)
    {
        double numero1, numero2;
        Scanner scanner = new Scanner(System.in);
         System.out.println("Capture el primer numero: ");
        numero1= scanner.nextDouble();
        System.out.println("Capture el segundo numero: ");
        numero2= scanner.nextDouble();
        
        if(numero1==numero2)
        {
           System.out.println("Los dos numeros son iguales: "); 
        }
        else
        {
            System.out.println("Los dos numeros son diferentes: "); 
        }
    }
}
