/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a,b,c,d,aux;
        
        System.out.println("Ingrese 4 numeros.");
        System.out.print("1er numero: ");
        a = leer.nextInt();
        System.out.print("2do numero: ");
        b = leer.nextInt();
        System.out.print("3r numero: ");
        c = leer.nextInt();
        System.out.print("4to numero: ");
        d = leer.nextInt();
        
        
        System.out.println("Los numeros ingresados son: A="+a+", B="+b+", C="+c+" y D="+d);
        
        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;
        
        System.out.println("Los numeros ahora son: A="+a+", B="+b+", C="+c+" y D="+d);
    }
    
}
