/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
 */
package javaapplication1;

import java.util.*;

/**
 *
 * @author Nnahu
 */
public class ejercicio22 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int n1 = leer.nextInt();
        int[] vector = new int[n1];

        System.out.print("Ingrese el numero que quiere buscar dentro del vector para conocer si se repite: ");
        int num1 = leer.nextInt();
        int contador = 0;
        for (int i = 0; i < n1; i++) {
            vector[i] = (int) (Math.random() * 10 + 0);
            System.out.print(" " + vector[i] + " ");
            if (vector[i] == num1) {
                contador += 1;
                System.out.println(" El n° ingresado: " + num1 + " si esta aca ");
            } else {
                System.out.println(" El n° ingresado: " + num1 + " no esta aca. ");
            }
        }
        System.out.println(" El n° ingresado: " + num1 + " se repite: " + contador);
    }
}
