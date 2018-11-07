
package supermercado;

public class Clientes {
    String cliente;
    String carrito;
    
    public Clientes(String cliente, String carrito){
        this.cliente = cliente;
        this.carrito = carrito;
    }
 
    @Override
    public String toString(){
        return cliente + " - " + carrito +"\n";
    } 

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCarrito() {
        return carrito;
    }

    public void setCarrito(String carrito) {
        this.carrito = carrito;
    }
    
    
}
