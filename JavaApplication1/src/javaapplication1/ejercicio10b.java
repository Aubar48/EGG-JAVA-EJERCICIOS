/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author Nnahu
 */
public class ejercicio10b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase que inicie con A o a:");
        String cadenaTexto = sc.nextLine();
        String primeraLetra = cadenaTexto.substring(0, 1);
        if ("a".equals(primeraLetra) || "A".equals(primeraLetra)) {
            System.out.println("Es correcto");
        } else {
            System.out.println("Es incorrecto");
        }
    }
}
