/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_7_do.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_7_doWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {Scanner leer = new Scanner(System.in);
        int num, cantNum, max, min, cont=0;
        float sum;
        
        System.out.println("Ingrese la cantidad de numeros a comparar");
        cantNum = leer.nextInt();
        
        System.out.println("Ingrese un numero.");
        System.out.print("Nuemro "+(cont+1)+": ");
        num = leer.nextInt();
        max=num;
        min=num;
        sum=num;
        cont++;
        
        do{
            System.out.println("Ingrese un numero.");
            System.out.print("Nuemro "+(cont+1)+": ");
            num = leer.nextInt();
            
            if(num<min){
                min=num;
            }else if(num>max){
                max=num;
            }

            sum+=num;
            cont++;
        }while(cont<cantNum);
        
        System.out.println("El valor maximo ingresado es: " + max);
        System.out.println("El valor minimo ingresado es: " + min);
        System.out.println("El promedio de todos los numeros ingresados es: " + (sum/cantNum));
    }
    
}
