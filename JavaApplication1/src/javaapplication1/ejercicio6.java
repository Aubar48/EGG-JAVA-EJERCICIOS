/*
 Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
 */
package javaapplication1;

import java.util.*;

/**
 *
 * @author Nnahu
 */
public class ejercicio6 {

    public static void main(String[] args) {
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos valores numericos: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        if (num1 > num2) {
            System.out.println("el numero " + num1 + " es mayor al numero " + num2 + " ingresado. ");
        } else {
            System.out.println("el numero " + num2 + " es mayor al numero " + num1 + " ingresado. ");
        }
              
                
    }
}
