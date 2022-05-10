/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package javaapplication1;

import java.util.*;

/**
 *
 * @author Nnahu
 */
public class ejercicio5 {

    public static void main(String[] args) {
        int num1;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un valor numerico: ");
        num1 = leer.nextInt();

        System.out.println("El valor numerico multiplicado es: " + num1 * 2);
        System.out.println("El valor numerico triplicado es: " + num1 * 3);
        System.out.println("La raiz cuadrada del valor numerico es: " + Math.sqrt(num1));
    }
}
