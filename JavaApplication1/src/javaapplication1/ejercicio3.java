/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.
 */
package javaapplication1;

import java.util.*;

/**
 *
 * @author Nnahu
 */
public class ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase, frase1, frase2;
        System.out.println("Ingrese una frase sin espacios: ");
        frase = leer.nextLine();
        frase1 = frase.toLowerCase();
        frase2 = frase.toUpperCase();
        System.out.println("La frase en mayusculas es: " + frase.toUpperCase());
        System.out.println("La frase en minusculas es: " + frase1.toLowerCase());

    }

}
