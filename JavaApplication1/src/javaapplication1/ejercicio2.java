/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla.
 */
package javaapplication1;

import java.util.*;

/**
 *
 * @author Nnahu
 */
public class ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tu nombre:");
        nombre = leer.next();
        System.out.println("El nombre es: " + nombre);
    }
}
