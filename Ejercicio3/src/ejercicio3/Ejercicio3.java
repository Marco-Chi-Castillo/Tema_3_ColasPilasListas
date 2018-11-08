
package ejercicio3;

/**
 * @author Marco Antonio Chi Castillo
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        Lista li = new Lista();
        Pila pi = new Pila();
        String nombre, edad, telefono, regalo;
        int op, //opciones
        tot = 0, //total de personas
        regl = 0; //total de regalos
        String[] nombres;
        String[] nombresSinD;
        ArrayList regalos = new ArrayList();
        int lim = 0; //limites de regalos
          
        do{
            System.out.println("\n1- Ingresar");
            System.out.println("2- Ver Empleados");
            System.out.println("3- Poner los Regalos");
            System.out.println("4- Ver los Regalos");
            System.out.println("5- Repartir los Regalos");
            System.out.println("6- Salir");
            System.out.print("OPCION: ");op = en.nextInt();
            switch(op){
                case 1:
                    System.out.print("\nNombre: "); nombre = en.next();
                    System.out.print("Edad: "); edad = en.next();
                    System.out.print("Telefono: "); telefono = en.next();
                    li.agregarAlFinal(new Persona(nombre, edad, telefono, ""));
                    tot++; //suma de los empleados
                    break;
                    
                case 2:
                    li.listar();
                    break;
                case 3:
                    nombres = li.pasaNombresArreglo(li);
                    nombresSinD = li.RemoverDupli(nombres);
                     
                    lim = nombresSinD.length - regl; //calculo para agregar a personas exactas
                    System.out.println("Te faltan " + lim +  " Regalos para lograr dar a todos.\n");
                    for(int i = 0; i < lim ; i++){
                        System.out.print((i+1)+ "- Regalo: "); regalo = en.next();
                        pi.apilar(regalo);
                        regl++; //Suma de los regalos
                    }
                    break;
                case 4:
                    pi.listar();
                    break;
                case 5: 
                    nombres = li.pasaNombresArreglo(li);
                    nombresSinD = li.RemoverDupli(nombres);
                    
                    Lista nuevo = new Lista();
                    if(nombresSinD.length ==  regl && pi.getTamanio() != 0 ){ //Condicion para que valla agregando
              
                        
                    for(int i = 0; i < lim; i++){ //añade todos los regalos a un arrayslist y a la vez los retira
                         regalos.add(pi.retirar());
                     }
                    
                     for(int i = 0; i < nombresSinD.length; i++){
                         System.out.println("[" + (i+1) + " Empleado");
                         System.out.println("Nombre: " + nombresSinD[i]);
                         System.out.println("Regalo: " + regalos.get(i) + "]\n");
                     }
                    }else{
                        System.out.println("Regalos insuficientes");
                   }
                    break;
            }
        }while(op!=6);
        
        
        
        
        
    }
    
}
