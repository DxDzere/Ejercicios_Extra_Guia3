/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char socio;
        int monto;
        
        System.out.println("Ingrese la clase del socio. (A/B/C)");
        socio = leer.next().toUpperCase().charAt(0);
        
        while(socio!='A' && socio!='B' && socio!='C'){
            System.out.println("ERROR. "+socio+" no es una clase valida." );
            System.out.println("Por favor reingrese la clase. Recuerde que debe ser: A/B/C");
            socio = leer.next().toUpperCase().charAt(0);
        }
        
        System.out.println("Ingrese el monto a cobrar.");
        monto = leer.nextInt();
        
        switch(socio){
            case 'A':
                System.out.println("Se deve cobrar: "+ (monto*0.5));
                break;
            case 'B':
                System.out.println("Se deve cobrar: "+ (monto*0.65));
                break;
            case 'C':
                System.out.println("Se deve cobrar: "+ monto);
                break;
        }
    }
    
}
