/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int minutos;
        
        System.out.println("Ingrese un tiempo en minutos para convertir");
        minutos=leer.nextInt();
        
        System.out.println(minutos + " minutos son: "+(minutos/60/24) +" dias y "+(minutos/60%24)+" horas.");
    }
    
}
