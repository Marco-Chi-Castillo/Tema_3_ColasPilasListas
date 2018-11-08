
package ejercicio2;

import java.util.Scanner;
public class Ejercicio2 {
    
    
    public static void main(String[] args) {
      Scanner en = new Scanner(System.in);
      Nodo n = new Nodo();
      Cola c = new Cola();
      Pila p = new Pila();
      
      String res;
      int dato;
      
      do{
          System.out.print("Ingresar dato s/n: ");  
          res = en.next();
          if(!"n".equals(res)){
               System.out.print("Dato: ");
                dato = en.nextInt();
                p.apilar(dato);
          }
      }while(!"n".equals(res));
      
      p.listar();
      p.PasarDatos(c);
      c.MostrarCola();
    }
}
