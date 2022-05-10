/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
package javaapplication1;
 */
package javaapplication1;

import java.util.*;

/**
 *
 * @author Nnahu
 */
public class ejercicio8 {

    public static void main(String[] args) {
        String frase;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese su contraseña: ");
        frase = leer.next();
        if ("eureka".equals(frase)) {
            System.out.println("Contraseña correcta, ah ingresado al sistema. ");
        } else {
            System.err.println("Contraseña incorrecta, reinicie el sistema. ");
        }

    }
}
