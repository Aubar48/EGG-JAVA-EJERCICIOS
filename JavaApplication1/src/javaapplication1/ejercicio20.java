/*
 Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author Nnahu
 */
public class ejercicio20 {

    public static void main(String[] args) {
        int euros;
        String moneda;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el monto total de euros que desea convertir: ");
        euros = leer.nextInt();
        System.out.print("Ingrese la salida: DOLAR, YENES, LIBRAS: ");
        moneda = leer.next().toUpperCase();

        cambiarMoneda(euros, moneda);
    }

    public static void cambiarMoneda(int euros, String moneda) {
        switch (moneda) {
            case "DOLAR":
                System.out.println(euros + " Euros equivalen a: " + (euros * 1.28) + " U$D ");
                break;
            case "YENES":
                System.out.println(euros + " Euros equivalen a: " + (euros * 129.852) + " YENES ");
                break;
            case "LIBRAS":
                System.out.println(euros + " Euros equivalen a: " + (euros * 0.86) + " LIBRAS ");
                break;
            default:
                System.err.println("No ingreso ninguna moneda valida. ");
                break;
        }
    }

}
