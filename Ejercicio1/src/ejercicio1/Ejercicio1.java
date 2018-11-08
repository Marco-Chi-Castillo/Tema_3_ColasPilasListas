
package ejercicio1;

/**
 *
 * @author Marco Antonio Chi Castillo
 */

import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
       Pila p = new Pila();
       Scanner en = new Scanner(System.in);
       
       //Ingreso de datos
        System.out.print("Dato: "); 
        String Cadena = en.nextLine();
        
        //Pasamos el String en un areglo char para su impresion individual
        char[] Cadena_char = Cadena.toCharArray();
        //Pasamos los datos a la pila
        p.PasarDatos(Cadena_char);
       
        p.listar();
       
    }
}
