/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosLogica;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class AlReves {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int numero, numeroI=0, decimal,cen,mil,uni;
        
        System.out.println("Ingrese la cantidad: ");
        numero = scanner.nextInt();
        
        numero = numero%100;
        numero =  numero%1000;
        decimal = numero/10;
        cen= numero/100;
        mil= numero/1000;
        uni=numero%10;
        
        numeroI= (uni*1000)+(decimal*100)+(cen*10)+mil;
        
        System.out.println("El numero invertido es: "+ numeroI);
    }
}
