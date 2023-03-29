/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7_while;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_7_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, cantNum, max=0, min=0, cont=1;
        float sum=0;
        
        System.out.println("Ingrese la cantidad de numeros a comparar");
        cantNum = leer.nextInt();
        
        while(cont<=cantNum){
            System.out.println("Ingrese un numero.");
            System.out.print("Nuemro "+cont+": ");
            num = leer.nextInt();
            
            if(cont == 1){
                max=num;
                min=num;
            }else if(num<min){
                min=num;
            }else if(num>max){
                max=num;
            }
            sum+=num;
            cont++;
        }
        
        System.out.println("El valor maximo ingresado es: " + max);
        System.out.println("El valor minimo ingresado es: " + min);
        System.out.println("El promedio de todos los numeros ingresados es: " + (sum/cantNum));
    }
    
}
