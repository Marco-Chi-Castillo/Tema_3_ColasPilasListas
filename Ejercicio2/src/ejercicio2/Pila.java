
package ejercicio2;
/**
 * @author  Marco Antonio Chi Castillo
 */
public class Pila {    
    // Puntero que indica el inicio de la pila o tambein conocida como el
    // tope de la pila.
    private Nodo inicio;
    // Variable para registrar el tamaño de la pila.
    private int tamanio;
    /**
     * Constructor por defecto.
     */
    public void Pila(){
        inicio = null;
        tamanio = 0;
    }
   

    /**
     * Consulta si la pila esta vacia.
     * @return true si el primer nodo (inicio), no apunta a otro nodo.
     */
    public boolean esVacia(){
        return inicio == null;
    }
    /**
     * Consulta cuantos elementos (nodos) tiene la pila.
     * @return numero entero entre [0,n] donde n es el numero de elementos
     * que contenga la lista.
     */
    public int getTamanio(){
        return tamanio;
    }
    /**
     * Agrega un nuevo nodo a la pila.
     * @param valor a agregar.
     */
    public void apilar(int valor){
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        // Agrega al valor al nodo.
        nuevo.setValor(valor);
        // Consulta si la pila esta vacia.
        if (esVacia()) {
            // Inicializa la pila con el nuevo valor.
            inicio = nuevo;
        }
        // Caso contrario agrega el nuevo nodo al inicio de la pila.
        else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        // Incrementa el contador del tamaño.
        tamanio++;
    } 
    
       public void listar(){
        // Crea una copia de la pila.
        Nodo aux = inicio;
        // Recorre la pila hasta el ultimo nodo.
        while(aux != null){
            System.out.println("|\t" + aux.getValor() + "\t|");
            System.out.println("-----------------");
            aux = aux.getSiguiente();
            
            
        }
    }
    
      public void PasarDatos(Cola c){
        // Crea una copia de la pila.
        Nodo aux = inicio;
        // Recorre la pila hasta el ultimo nodo.
        while(aux != null){
            c.insertar(aux.getValor());
            aux = aux.getSiguiente();
        }
    }
}
