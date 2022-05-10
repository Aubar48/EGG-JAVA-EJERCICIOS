/*
. Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package javaapplication1;

import java.util.*;

/**
 *
 * @author Nnahu
 */
public class ejercicio4 {

    public static void main(String[] args) {
        double num1, num2;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de grados centigrados: ");
        num1 = leer.nextDouble();
        num2 = 32 + (9 * num1 / 5);
        System.out.println("La cantidad de grados en fahrenheit es: " + num2);
    }
}
