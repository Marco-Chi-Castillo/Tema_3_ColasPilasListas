
package supermercado;

/**
 * @author Equipo 
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;
public class Supermercado {

    public static void main(String[] args) {
         Scanner en = new Scanner(System.in);
         Carritos_Clientes cc = new Carritos_Clientes(); //Operaciones para trabajar.
         
         ArrayList car = new ArrayList();
         car = cc.Carrito(car); //LLenado de mi carrito.
         
         //Colas para las cajas registradoras
         Queue c1 =new LinkedList();
         Queue c2 =new LinkedList();
         Queue c3 =new LinkedList();
         
          //Clentes que llegan a la tienda
         Queue clientes =new LinkedList();
         Queue clientes_espera =new LinkedList();
        
 
         int nc = 1, //numero carrito
         op = 0; //opcion
         int pag = 1; //contador para pasar a las cajas
         int pag2 = 1; //contador para pagar
         int sum = 0; ////Calcula cuantas personas estan en caja
         
         do{
         System.out.println("\n1- Llega Un Cliente");
         System.out.println("2- Pasar A Las Cajas");
         System.out.println("3- Pagar");
         
         System.out.println("--------------------------");
         System.out.println("4- Ver Clientes en la tienda");
         System.out.println("5- Ver Clientes en las cajas");
         System.out.println("6- Ver carritos Disponibles");
         
         System.out.println("7- Salir");
         System.out.print("OPCION: ");
          
         op = en.nextInt();
         
            switch(op){
             case 1:
                sum = c1.size() + c2.size() + c3.size(); //Calcula cuantas personas estan en caja
                cc.llegaCliente(clientes,clientes_espera, car, nc, sum);
                nc++; //Contador de clientes.
                 break;
             case 2:
                  if(clientes.size() != 0){  //Siempre y cuando exista gente en la tienda realiza esta operacion
                    cc.PasarEnCajas(clientes,c1, c2, c3, pag);
                    cc.VerCajas(c1, c2, c3);
                    if(pag != 3){
                        pag++;
                    }else{
                        pag = 1;
                    }
                 }else{
                     System.out.println("Ya pasaron todos a las cajas");
                 }
       
                 break;
             case 3: 
                 sum = c1.size() + c2.size() + c3.size();//Calcula cuantas personas estan en caja
                 if(sum != 0){ //Siempre y cuando haya gente en las cajas para pagar se realiza esta operacion
                    cc.Pagar(clientes_espera, clientes, car, c1, c2, c3, pag2);
                    cc.VerCajas(c1, c2, c3);
                    if(pag2 != 3){
                        pag2++;
                    }else{
                        pag2 = 1;
                    }
                 }else{
                     System.out.println("Ya pagaron todos");
                 }
                 break;
             case 4:
                  System.out.println("\nClientes En La Tienda \n" + clientes);
                  System.out.println("\nClientes En Espera \n" +  clientes_espera);
                 break;
             case 5:
                 cc.VerCajas(c1, c2, c3);
                 
                 break;
             case 6:
                System.out.println("Carritos Disponible - " + car.size());
                System.out.println(car);
                 break;
            }
         }while(op != 7);
    } 
}
