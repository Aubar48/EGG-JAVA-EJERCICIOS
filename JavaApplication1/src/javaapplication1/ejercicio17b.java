/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Nnahu
 */
public class ejercicio17b {

    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {

                    if (i != 3) {
                        System.out.print(i);
                    } else {
                        System.out.print("E");
                    }

                    if (j != 3) {
                        System.out.print(j);
                    } else {
                        System.out.print("E");
                    }

                    if (k != 3) {
                        System.out.print(k);
                    } else {
                        System.out.print("E");
                    }
                    System.out.println("");
                }
            }
        } 
    } 
} 
