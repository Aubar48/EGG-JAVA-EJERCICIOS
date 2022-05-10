/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package javaapplication1;

import java.util.*;

/**
 *
 * @author Nnahu
 */
public class ejercicio10 {

    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase que inicie con A o a: ");
        frase = leer.next();
        if (frase.startsWith("a") || frase.startsWith("A")) {
            System.out.println( frase + " Es correcto ");
        } else {
            System.err.println(frase + " No es correcto ");
        }
    }
}
