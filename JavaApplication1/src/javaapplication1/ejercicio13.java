/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial. 
 */
package javaapplication1;

import java.util.*;

/**
 *
 * @author Nnahu
 */
public class ejercicio13 {

    public static void main(String[] args) {
        int num1, num2, suma = 0;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero positivo entero limite: ");
        num1 = leer.nextInt();
        while (suma < num1) {
            System.out.print("Ingrese un numero positivo entero: ");
            num2 = leer.nextInt();
            suma = (suma + num2);
        }
        System.out.println("El primer valor ingresado como entero limite: " + num1 + " Fue superado por: " + suma);
    }
}