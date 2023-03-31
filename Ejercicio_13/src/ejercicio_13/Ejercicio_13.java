/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_13;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int altura, imp=1;
        
        System.out.println("Ingrese la altura de la escalera");
        altura=leer.nextInt();
        
        for (int i=1; i<=altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        } 
    }
    
}
