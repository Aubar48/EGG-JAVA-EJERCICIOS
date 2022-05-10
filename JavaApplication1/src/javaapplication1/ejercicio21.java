/*
 Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
 */
package javaapplication1;

/**
 *
 * @author Nnahu
 */
public class ejercicio21 {

    public static void main(String[] args) {

        int[] vector = new int[100];

        for (int i = 99; i >= 0; i--) {  //Llena el vector
            vector[i] += i;                  // vector[i] = vector[i] + i Es lo mismo el contador
            System.out.println(vector[i]);
        }
        //for (int i = 99; i >=0; i--) { //Imprime el vector de forma Descendente 
        //  System.out.println(vector[i]);

    }

}

//}

/*for (int i = 0; i < 100; i++) { Imprime el vector de forma Ascendente 
            System.out.println(vector[i]);

        }*/
