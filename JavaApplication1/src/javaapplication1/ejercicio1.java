/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
 */
package javaapplication1;

import java.util.*;

/**
 *
 * @author Nnahu
 */
public class ejercicio1 {

    public static void main(String[] args) {
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos valores numericos: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println("La sumatoria de los n° ingreados es: " + (num1 + num2));
    }
}
