package supermercado;

import java.util.ArrayList;
import java.util.Queue;

public class Carritos_Clientes {
    public ArrayList Carrito(ArrayList car) {
        for (int i = 1; i <= 25; i++) {
            car.add("Carrito #" + i);
        }
        return car;
    }

    public void llegaCliente(Queue clientes, Queue clientes_espera, ArrayList car, int nc, int sum) {
        if (car.size() != 0) { //Siempre y cuando haya carritos disponibles se realiza esta operacion.
            clientes.add(new Clientes("Cliente #" + nc, (String) car.remove(car.size()-1))); //Se agregar un cliente con su carrito, que a la vez se quita de la lista carrito
            System.out.println("Carritos Disponibles: " + (car.size()));
            System.out.println("Clientes en la tienda: " +  (clientes.size()+sum));
        } else {
            System.out.println("Esta en Espera");
            clientes_espera.add(new Clientes("Cliente #" + nc, " ")); //Se agrega un cliente pero sin carrito
        }
    }

    public void VerCajas(Queue c1, Queue c2, Queue c3) {
        System.out.println("Caja 1: "); //Muestra caja 1
        System.out.println(c1);
        System.out.println("Caja 2: ");//Muestra caja 2
        System.out.println(c2);
        System.out.println("Caja 3: ");//Muestra caja 3
        System.out.println(c3);
    }

    public void PasarEnCajas(Queue clientes, Queue c1, Queue c2, Queue c3, int pag) {
        if (pag == 1) {
            c1.add(clientes.remove()); //Pasa el cliente en la lista caja 1 y se eliminan de la lista cliente
        }
        if (pag == 2) {
            c2.add(clientes.remove()); //Pasa el cliente en la lista caja 2 y se eliminan de la lista cliente
        }
        if (pag == 3) {
            c3.add(clientes.remove()); //Pasa el cliente en la lista caja 3 y se eliminan de la lista cliente
        }
    }

    public void Pagar(Queue clientes_Espera, Queue clientes, ArrayList car, Queue c1, Queue c2, Queue c3, int pag2) {
        System.out.println("Carritos Disponibles: " + car.size()+ "\n");
        if (clientes_Espera.size() == 0) { //Si no hay nadie en espera se realiza todo esto
            if (pag2 == 1 && c1.size() != 0) { //Si se elige la caja 1 y caja 1 tiene gente se hace todo esto
                Clientes c = (Clientes) c1.remove(); //Se extrae el objeto para usarlo y a la vez eliminar a la persona de la caja 1
                car.add(c.getCarrito());  // Se extrae el carrito que tenia y se lo cargamos de nuevo a la lista carrito
                //car.add(0,c.getCarrito());
            }
            if (pag2 == 2 && c2.size() != 0) { //Si se elige la caja 2 y caja 2 tiene gente se hace todo esto
                Clientes c = (Clientes) c2.remove();
                car.add(c.getCarrito());
                //car.add(0,c.getCarrito());
            }
            if (pag2 == 3 && c3.size() != 0) { //Si se elige la caja 3 y caja 3 tiene gente se hace todo esto
                Clientes c = (Clientes) c3.remove();
                car.add(c.getCarrito());
               // car.add(0,c.getCarrito());
            }
        }else { //Si existe gente en espera se hace todo esto.
            if (pag2 == 1 && c1.size() != 0) { //Si se elige la caja 1 y caja 1 tiene gente se hace todo esto
                Clientes c = (Clientes) c1.remove(); //Se extrae el objeto para usarlo y a la vez eliminar a la persona de la caja 1
                car.add(c.getCarrito()); // Se extrae el carrito que tenia y se lo cargamos de nuevo a la lista carrito

                Clientes espe = (Clientes) clientes_Espera.remove(); //Quitamos el cliente de espera y a la vez extraemos el objeto de su dato
                clientes.add(new Clientes(espe.getCliente(), (String) car.remove(0))); //insertamos el cliente que estaba en espera a la lista de clientes 
            }                                                                          //extrayendo su nombre y tomando un carrito de la lista y a la vez elimina ese carrito
            if (pag2 == 2 && c2.size() != 0) {
                Clientes c = (Clientes) c2.remove();
                car.add(c.getCarrito());

               Clientes espe = (Clientes) clientes_Espera.remove();
                clientes.add(new Clientes(espe.getCliente(), (String) car.remove(0)));
            }
            if (pag2 == 3 && c3.size() != 0) {
                Clientes c = (Clientes) c3.remove();
                car.add(c.getCarrito());
                
                Clientes espe = (Clientes) clientes_Espera.remove();
                clientes.add(new Clientes(espe.getCliente(), (String) car.remove(0)));
            }
        }

    }
}
