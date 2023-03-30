/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_10;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, multAl;
        
        multAl=((int)(Math.random()*10))*((int)(Math.random()*10));
        
        System.out.println("Adivine el resultado de la multiplicacion.");
        num = leer.nextInt();
        
        while(num != multAl){
            System.out.println("LASTIMA. El numero ingrasado no es el resultado. Intentelo de nuevo");
            num = leer.nextInt();
        }
        
        System.out.println("CORRECTO!!!! "+num+" es el resultado."); 
    }
    
}
