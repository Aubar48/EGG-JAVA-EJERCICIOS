/*
 Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta. 
 */
package javaapplication1;

import java.util.*;

/**
 *
 * @author Nnahu
 */
public class ejercicio12 {

    public static void main(String[] args) {
        double num1;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.print("Ingrese una nota del 1 al 10: ");
            num1 = leer.nextDouble();
        } while (num1 < 0 || num1 > 10);
   System.out.println("La nota ingresada: " + num1 + ", es correcta.");
    }
}

     
