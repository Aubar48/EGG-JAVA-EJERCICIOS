/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Nnahu
 */
public class ejercicio19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cuatro numeros: ");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        int n3 = leer.nextInt();
        int n4 = leer.nextInt();

        System.out.print("\n" + n1 + " = ");
        for (n1 = n1 -1; n1 >= 0; n1--) {
            System.out.print(" * ");
        }
        System.out.print("\n" + n2 + " = ");
        for (n2 = n2 -1; n2 >= 0; n2--) {
            System.out.print(" * ");
        }
        System.out.print("\n" + n3 + " = ");
        for (n3 = n3 -1; n3 >= 0; n3--) {
            System.out.print(" * ");
        }
        System.out.print("\n" + n4 + " = ");
        for (n4 = n4 -1; n4 >= 0; n4--) {
            System.out.print(" * ");
        }
    }
}
