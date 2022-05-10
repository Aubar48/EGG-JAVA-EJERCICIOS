/*
 *Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre
la traspuesta de la matriz.
 */
package javaapplication1;

import java.util.*;

/**
 *
 * @author Nnahu
 */
public class ejercicio24 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int n1 = leer.nextInt();
        int[][] matriz = new int[n1][n1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 0);
                System.out.print(matriz[i][j]);
            }
                System.out.println();
        }
    }
}

