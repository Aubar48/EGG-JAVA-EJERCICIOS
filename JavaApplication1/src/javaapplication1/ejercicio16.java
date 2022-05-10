/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author Nnahu
 */
public class ejercicio16 {

    public static void main(String[] args) {
        boolean seguir = true;
        Scanner leer = new Scanner(System.in);
        int contadorCorrecto = 0, contadorIncorrecto = 0;
        do {
            System.out.print("Ingrese una cadena. Maximo 5 caracteres y el primer caracter debe ser una: X , y debe finalizar la cadena con una: O : ");
            String cadena = leer.nextLine();
            if (cadena.length() == 5) {
                if (cadena.substring(0, 1).toUpperCase().equals("X") && cadena.substring(4, 5).toUpperCase().equals("O")) {
                    contadorCorrecto = contadorCorrecto + 1;
                    seguir = true;
                } else if (cadena.equals("&&&&&")) {
                    System.out.println("Final de envios.");
                    break;
                } else {
                    contadorIncorrecto = contadorIncorrecto + 1;
                    seguir = true;
                }
            } else {
                System.err.println("Debe ser una cadena de 5 caracteres.");
            }
        } while (seguir = true);
        System.out.println("La cantidad de cadenas correctas es: " + contadorCorrecto);
        System.out.println("La cantidad de cadenas incorrectas es: " + contadorIncorrecto);
    }
}
    

