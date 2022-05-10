/*
 Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT
. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).
En este caso la matriz es anti simétrica.
 */
package javaapplication1;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Nnahu
 */
public class ejercicio25 {

     public static void main(String[] args) {
        //Variables
        int matriz [][], matrizT[][], columnas, filas;
        //Objeto escaner
        Scanner leer= new Scanner(System.in);
        //Ingreso de las dimensiones de la mtrices
        filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de filas (n): "));
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de columnas (m): "));
        //Crear matriz
        matriz = new int[filas][columnas];
        matrizT = new int[columnas][filas];
        //Llenar la matriz
        System.out.println("Digite la matriz: ");
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print("Digite un numero en la posicion ["+i+"]["+j+"] : ");
                matriz[i][j] = leer.nextInt();
            }
        }
        //Comprobar si es simetrica
        if(filas != columnas){
            JOptionPane.showMessageDialog(null, "La matriz no es simetrica debido a que no es cuadrada D:");
        }
        else{
            for(int i=0; i<filas; i++){
                for(int j=0; j<columnas; j++){
                    matrizT[j][i] = matriz[i][j];
                }
            }
            if(Arrays.deepEquals(matriz, matrizT)){
                JOptionPane.showMessageDialog(null, "La matriz es simetrica :D");
            }
            else{
                JOptionPane.showMessageDialog(null, "La matriz no es simetrica D:");
            }
        }
        System.out.println("La matriz original es: ");
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("La matriz transpuesta es: ");
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                System.out.print(matrizT[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

