/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int personas,cont=0;
        float estatura,sum1=0,sum2=0;
        
        System.out.println("Ingrese la cantidad de personas a contavilizar");
        personas=leer.nextInt();
        
        for (int i = 1; i <= personas; i++) {
            System.out.println("Ingrese la estatura de la persona.");
            estatura = leer.nextFloat();
            
            if(estatura<1.60){
                sum1+=estatura;
                cont++;
            }
            sum2+=estatura;
        }
        
        System.out.println("La estatura promedio de las personas con una estatura inferior a 1.60m "
                           +"es: "+ (sum1/cont));
        
        System.out.println("La estatura promedio de todas las personas es: "+(sum2/personas));
        
    }
    
}
