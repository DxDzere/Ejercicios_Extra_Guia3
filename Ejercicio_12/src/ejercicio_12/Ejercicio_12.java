/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_12;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if(i==3){
                        System.out.print("E-");
                    }else{
                        System.out.print(i+"-");
                    }
                    if(j==3){
                        System.out.print("E-");
                    }else{
                        System.out.print(j+"-");
                    }
                    if(k==3){
                        System.out.println("E");
                    }else{
                        System.out.println(k);
                    }
                }
            }
        }
    }
    
}
