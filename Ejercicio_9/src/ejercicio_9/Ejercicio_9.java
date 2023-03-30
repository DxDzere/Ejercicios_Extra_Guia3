/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_9;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int divisor, dividendo,coc=0;
        
        System.out.println("Ingrese 2 numeros enteros mayores a 1 para dividir");
        System.out.print("Divisor: ");
        divisor=leer.nextInt();
        while(divisor<=1){
            System.out.println("ERROR. El numero no puede ser menor o igual a 1.");
            System.out.print("Por favor reingrese el divisor: ");
            divisor = leer.nextInt();
        }
        
        System.out.print("Dividendo: ");
        dividendo=leer.nextInt();
        while(dividendo<=1){
            System.out.println("ERROR. El numero no puede ser menor o igual a 1.");
            System.out.print("Por favor reingrese el cociente: ");
            dividendo = leer.nextInt();
        }
        
        do{
            dividendo-=divisor;
            coc++;
        }while(dividendo>=divisor);
        
        System.out.println("El cociente de la division es: "+ coc);
        System.out.println("El resto de la division es: "+ dividendo);
    }        
}
