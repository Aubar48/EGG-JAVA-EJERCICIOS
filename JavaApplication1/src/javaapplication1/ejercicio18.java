/*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
* *
* *
* * * *
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Nnahu
 */
public class ejercicio18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del cuadrado: ");
        int num1 = leer.nextInt();
        if (num1 > 0) {
            //Linea superior
            for (int i = 0; i < num1; i++) {
                System.out.print("*");
            }
            System.out.println();

            //Linea central
            for (int i = 0; i < num1 - 2; i++) {
                System.out.print("*");
                for (int j = 0; j < num1 - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            //Linea inferior
            for (int i = 0; i < num1; i++) {
                System.out.print("*");
            }
        }

    }
}
