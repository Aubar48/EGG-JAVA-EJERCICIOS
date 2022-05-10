/*
Una Bandera es una variable booleana que nos indica si ha ocurrido un suceso. Por ejemplo, podemos utilizar una bandera para saber si, 
tras recorrer una lista de datos, 
hemos encontrado algún número mayor que 17.

Para usar una bandera hay que: declararla, inicializarla, cambiarla (cuando corresponda) y consultarla. Veamos un ejemplo:
/**
 *
 * @author Nnahu
 */
package javaapplication1;
public class EJEMPLOS {
    public static void main(String[] args) {                                   	
       int[] lista;          // Lista de números enteros que supondremos llena.
        lista = new int[100];
        boolean bandera = false;	// Declaramos e inicializamos la bandera.
        for (int i = 0; i < 100; i++) {
            if (lista[i] > 17) {
                bandera = true;	// Cambiamos la bandera si corresponde
            }
        }
        // Al finalizar el programa, la bandera nos indica si algo ha ocurrido
        if (bandera) {
            System.out.println("Hay algún número mayor que 17.");
        } else {
            System.out.println("No hay ningún número mayor que 17.");
        }
    }
}
//Conviene que los nombres de las banderas sean significativos del suceso que monitorizan. Nombres habituales son "encontrado", "hayMayor",
//"error", "correcto"...

