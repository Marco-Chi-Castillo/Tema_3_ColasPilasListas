
package ejercicio3;

public class NodoLista {
     // Variable en la cual se va a guardar el valor.
    private Persona valor;
    // Variable para enlazar los nodos.
    private NodoLista siguiente;
    /**
     * Constructor que inicializamos el valor de las variables.
     * @param dato
     * @param siguiente
     */
    public void Nodo(Persona dato, NodoLista siguiente){
        this.valor = dato;
        this.siguiente = siguiente;
    }
    
    // Métodos get y set para los atributos.
    
    public Persona getValor() {
        return valor;
    }

    public void setValor(Persona  valor) {
        this.valor = valor;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    } 
}
