/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, cont=0, cantNumPar=0, cantNumImp=0;
        
        do{
            System.out.println("Ingrese un numero mayor a 0");
            System.out.print("Numero "+(cont+1)+": ");
            num = leer.nextInt();
            while(num<=0){
                System.out.println("ERROR. El numero debe ser mayor a 0.");
                System.out.println("Por favor reingrese el numero.");
                num = leer.nextInt();
            }
            
            if(num%2==0){
                cantNumPar++;
            }else{
                cantNumImp++;
            }
            cont++;
        }while(num%5 != 0);
        
        System.out.println("La cantidad de numeros ingresados es: " + cont);
        System.out.println("La cantidad de numeros pares ingresados es: " + cantNumPar);
        System.out.println("La cantidad de numeros impares ingresados es: " + cantNumImp);
    }
    
}
