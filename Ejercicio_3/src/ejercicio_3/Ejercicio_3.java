/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        
        System.out.println("Ingrese una letra.");
        letra = leer.next();
        
        if(letra.toUpperCase().equals("A") || letra.toUpperCase().equals("E") || 
           letra.toUpperCase().equals("I") || letra.toUpperCase().equals("O") ||
           letra.toUpperCase().equals("U")){
            
            System.out.println("La letra ingresada es una vocal.");
        }else{
            System.out.println("La letra ingresada no es una vocal.");
        }
    }
}
