/*
 Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.
Ejemplo:
Como podemos observar nuestra submatriz P se encuentra en la matriz M en los
índices: 4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author Nnahu
 */
public class ejercicio27 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean bandera = false;
        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];

        //llenado de matriz M con numeros aleatorios 0 - 9 
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j] = (int) (Math.random() * 10);
            }
        }
        //Impresion de matriz M
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" | " + matrizM[i][j] + " | ");
            }
            System.out.println("");
        }

        //llenado Manual de matriz P (para hacerla que coincida)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Escriba el valor de la posición " + i + "-" + j + ": ");
                matrizP[i][j] = leer.nextInt();
            }
        }

        bandera = buscarMatriz(matrizM, matrizP); //de aca vuelve una variable "ban" que se guarda en bandera, de tipo booleana.

        if (bandera == true) {
            System.out.println("\n Felicitaciones por encontrarla \n");
        } else {
            System.out.println("\n MATRIZ NO ENCONTRADA :( \n");
        }

    }

    public static boolean buscarMatriz(int[][] matrizM, int[][] matrizP) {
        boolean ban = false;
        //Recorro la Matriz M en busca de la P
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrizM[i][j] == matrizP[0][0] && matrizM[i][j + 1] == matrizP[0][1] && matrizM[i][j + 2] == matrizP[0][2]) { //chequea la fila 1
                    if (matrizM[i + 1][j] == matrizP[1][0] && matrizM[i + 1][j + 1] == matrizP[1][1] && matrizM[i + 1][j + 2] == matrizP[1][2]) { //chequea la fila 2
                        if (matrizM[i + 2][j] == matrizP[2][0] && matrizM[i + 2][j + 1] == matrizP[2][1] && matrizM[i + 2][j + 2] == matrizP[2][2]) { //chequea la fila 3
                            System.out.println("\n ¡MATRIZ ENCONTRADA!");
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
