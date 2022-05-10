/*
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Nnahu
 */
public class ejercicio15 {

    public static void main(String[] args) {
        int num1, suma = 0;
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese un numero: ");
            num1 = leer.nextInt();
            if (num1 > 0)
                suma = (suma + num1);
            if (num1 == 0) {
                System.out.println("Se capturó el numero cero. ");
                break;    
            }
        }
        System.out.println("La suma de los numeros ingresados es: " + suma);
    }
}

