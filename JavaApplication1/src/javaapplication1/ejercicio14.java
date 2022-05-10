/*
 Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package javaapplication1;

import java.util.*;

/**
 *
 * @author Nnahu
 */
public class ejercicio14 {

    public static void main(String[] args) {
        int opc;
        float num1, num2;
        String frase = null;

        Scanner leer = new Scanner(System.in);

        do {

            System.out.println("1 " + " Suma ");
            System.out.println("2 " + " Resta ");
            System.out.println("3 " + " Multiplicación ");
            System.out.println("4 " + " Division ");
            System.out.println("5 " + " Salir ");
            System.out.println("Que operacion aritmetica necesita hoy?: ");
            opc = leer.nextInt();

            switch (opc) {
                case 1:

                    System.out.println("Que ingrese el primer y segundo valor numerico: ");
                    num1 = leer.nextInt();
                    num2 = leer.nextInt();
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case 2:

                    System.out.println("Ingrese el primer y segundo valor numerico: ");
                    num1 = leer.nextInt();
                    num2 = leer.nextInt();
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case 3:

                    System.out.println("Ingrese el primer y segundo valor numerico: ");
                    num1 = leer.nextInt();
                    num2 = leer.nextInt();
                    System.out.println("La mutiplicación es: " + (num1 * num2));
                    break;
                case 4:

                    System.out.println("Ingrese el primer y segundo valor numerico: ");
                    num1 = leer.nextInt();
                    num2 = leer.nextInt();
                    System.out.println("La division es: " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("Usted desea salir del programa (s/n)?");
                    frase = leer.next().toLowerCase();

                default:
                    System.err.print("Opcion erronea! ");

            }

        } while (!"s".equals(frase));
    }

}
        
        
            
        
        
    

                     
        
        
    
        
        

        

    

