/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package javaapplication1;

import java.util.Scanner;



/**
 *
 * @author Nnahu
 */
public class ejercicio26 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int sumaF = 0, sumaC = 0, sumaD1 = 0, sumaD2 = 0, sumaC2 = 0, sumaC3 = 0, conta = 0;
        int[][] vector = new int[3][3];
        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
                vector[i][j] = leer.nextInt();
                
            }
             
        }
        
        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
                sumaF += vector[i][j];
            }
            if (sumaF != 15) {
                break;
            } else {
                conta++;
            }
            sumaF = 0;
            sumaC3 += vector[i][2];
            sumaC2 += vector[i][1];
            sumaC += vector[i][0];
            sumaD1 += vector[i][i];
            int j = 0;
            sumaD2 += vector[i][j - 1];
        }
        if (conta == 3 && (sumaC3 + sumaC2 + sumaC + sumaD1 + sumaD2) % 15 == 0) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

    }

}


