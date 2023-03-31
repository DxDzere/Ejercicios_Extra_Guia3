/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_14;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int familias, hijos;
        float sumEdad=0, sumHijos=0;
        
        System.out.println("Ingrese la cantidad de familias que se presentaron");
        familias=leer.nextInt();
        
        for (int i = 0; i < familias ; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia "+ (i+1) );
            hijos=leer.nextInt();
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese la edad del hijo "+ (j+1));
                sumEdad += leer.nextInt();
            }
            sumHijos+=hijos;
        }
        System.out.println("El promedio de edad de todos los hijos es: "+ sumEdad/sumHijos);
    }
    
}
