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
 
import java.util.Scanner;
 
public class ejercicio27b{
 
    public static void main(String[] args){
 
     Scanner leer = new Scanner(System.in);
 
     int[][] matrixP = new int[3][3];
     int[][] matrixM = new int[10][10];
     boolean bandera = false;
 
     for (int i=0; i<10; i++) {
     for (int j=0; j<10; j++) {
     matrixM[i][j] = (int) (Math.random()*10);
     }
     }
 
     System.out.println("------------------------------");
     for(int i=0 ; i<10 ; i++){
     for(int j=0 ; j<10 ; j++){
     System.out.print("["+matrixM[i][j]+"]");    
     }
     System.out.println("");
     }
     System.out.println("------------------------------");
 
     for(int i=0 ; i<3; i++){
     for(int j=0 ; j<3 ; j++){
     System.out.println("Ingrese el valor de "+i+","+j+" de su matriz entre 0 y 9:");
     matrixP[i][j]= leer.nextInt();
     while(matrixP[i][j]>10 || matrixP[i][j]<0){
     System.out.println("Ingrese un valor válido para "+i+","+j+" entre 0 y 9:");
     matrixP[i][j]= leer.nextInt();
     }
     }  
     }
 
     System.out.println("---------");
     for(int i=0 ; i<3 ; i++){
     for(int j=0 ; j<3 ; j++){
     System.out.print("["+matrixP[i][j]+"]");    
     }
     System.out.println("");
     }
     System.out.println("---------");
 
     bandera = buscarMatriz(matrixM, matrixP);
 
     if (bandera == true){
     System.out.println(" ");
     System.out.println("Felicitaciones por encontrarla");
     } else {
     System.out.println("MATRIZ NO ENCONTRADA");
     }
 
    }
 
    public static boolean buscarMatriz(int[][] matrixM, int[][] matrixP){
 
        boolean ban = false;
 
        for (int i=0; i<8; i++) {
        for (int j=0; j<8; j++) {
        if (matrixM[i][j] == matrixP[0][0] && matrixM[i][j + 1] == matrixP[0][1] && matrixM[i][j + 2] == matrixP[0][2]){
        if (matrixM[i + 1][j] == matrixP[1][0] && matrixM[i + 1][j + 1] == matrixP[1][1] && matrixM[i + 1][j + 2] == matrixP[1][2]){
        if (matrixM[i + 2][j] == matrixP[2][0] && matrixM[i + 2][j + 1] == matrixP[2][1] && matrixM[i + 2][j + 2] == matrixP[2][2]){
        System.out.println("¡MATRIZ ENCONTRADA!");
        System.out.print("Posiciones: " + i + "," + j + " ;" + i + "," + (j + 1) + " ...hasta " + (i + 2) + "," + (j + 2));
        ban = true;                   
        }
        } 
        } 
        }
        }
        return ban;
    }
 }
