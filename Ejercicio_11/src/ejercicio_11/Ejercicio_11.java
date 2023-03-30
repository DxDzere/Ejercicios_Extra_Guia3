/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_11;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, cont=1;
        
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        
        do{
            num/=10;
            cont++;
        }while(num/10 != 0);
        
        System.out.println(cont);
    }
    
}
