/*
Crear un programa que dado un numero determine si es par o impar.
 */
package javaapplication1;

import java.util.*;

/**
 *
 * @author Nnahu
 */
public class ejercicio7 {

    public static void main(String[] args) {
        int num1;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un valor numericos, para saber si es par o impar: ");
        num1 = leer.nextInt();
        if (num1 == 0) {
            System.out.println("El valor " + num1 + " ingresado no es par ni impar. ");
        } else if (num1 % 2 == 0) {
            System.out.println("El valor " + num1 + " ingresado es par. ");
        } else if (!(num1 % 2 == 0)) {
            System.out.println("El valor " + num1 + " ingresado es impar. ");
        }
    }
}
