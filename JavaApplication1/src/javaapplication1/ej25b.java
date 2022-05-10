/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Nnahu
 */
public class ej25b {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean Bandera = false;
        boolean Banderin = true; 
        int[][] matrizT = new int[3][3];
        int matriz[][] = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + matriz[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("La transpuesta de la matriz es : ");
        System.out.println("");
 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizT[i][j] = matriz[j][i];
                System.out.print("|" + matrizT[i][j] + "|");
            }
            System.out.println("");
 
        }
        System.out.println("");
               
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == matrizT[i][j] * -1) {
                    Bandera = true;
 
                } else {
                    Banderin = false;
                }
            }
        }
        System.out.println(Bandera);
        System.out.println(Banderin);
    }
}

