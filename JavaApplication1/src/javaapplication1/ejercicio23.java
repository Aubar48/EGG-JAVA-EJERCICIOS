/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package javaapplication1;

import java.util.*;

/**
 *
 * @author Nnahu
 */
public class ejercicio23 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int n1 = leer.nextInt();
        int[] vector = new int[n1];
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        for (int i = 0; i < n1; i++) {
            vector[i] += i;
            System.out.print(vector[i]);
            if (vector[i] < 10) {
                contador1 += 1;
                System.out.println(" Tiene un digito");
            }
            if (vector[i] < 100 && vector[i] >= 10) {
                contador2 += 1;
                System.out.println(" Tiene dos digitos");

            }
            if (vector[i] < 1000 && vector[i] >= 100) {
                contador3 += 1;
                System.out.println(" Tiene tres digitos");

            }
            if (vector[i] < 10000 && vector[i] >= 1000) {
                contador4 += 1;
                System.out.println(" Tiene cuatro digitos");

            }
            if (vector[i] < 100000 && vector[i] >= 10000) {
                contador5 += 1;
                System.out.println(" Tiene cinco digitos");

            }
        }
        System.out.println("La cantidad n° de un digito es: " + contador1);
        System.out.println("La cantidad n° de dos digito es: " + contador2);
        System.out.println("La cantidad n° de tres digito es: " + contador3);
        System.out.println("La cantidad n° de cuatro digito es: " + contador4);
        System.out.println("La cantidad n° de cinco digito es: " + contador5);
    }
}
