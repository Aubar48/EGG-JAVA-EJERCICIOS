/*
 Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package javaapplication1;

import java.util.*;

/**
 *
 * @author Nnahu
 */
public class ejercicio9 {

    public static void main(String[] args) {
        String frase;
        int num1;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una frase de 8 digitos: ");

        frase = leer.next();
        num1 = (frase.length());
        if (num1 == 8) {
            System.out.println("La frase ingresada es: " + frase + ", tiene un total de " + num1 + " digitos, eso es genial :D. ");
        } else {
            System.err.println("La frase ingresada es: " + frase + ", tiene un total de " + num1 + " digitos, eso no es tan genial D:. ");
        }
    }
}
