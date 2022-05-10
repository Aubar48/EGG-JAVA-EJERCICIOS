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
public class prueba {

   

    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {

                    if (String.valueOf(i).equals("3")) {
                        System.out.print("E");
                    } else {
                        System.out.print(i);
                    }

                    if (String.valueOf(j).equals("3")) {
                        System.out.print("E");
                    } else {
                        System.out.print(j);
                    }

                    if (String.valueOf(k).equals("3")) {
                        System.out.print("E");
                    } else {
                        System.out.print(k);
                    }
                    System.out.println("");
                }
            }
        } 
    } 
} 


