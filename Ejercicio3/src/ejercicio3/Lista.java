
package ejercicio3;

import java.util.Arrays;

public class Lista {
      // Puntero que indica el inicio de la lista o conocida tambien
    // como cabeza de la lista.
    private NodoLista inicio;
    // Variable para registrar el tamaño de la lista.
    private int tamanio;
    /**
     * Constructor por defecto.
     */
    public void Lista(){
        inicio = null;
        tamanio = 0;
    }
    /**
     * Consulta si la lista esta vacia.
     * @return true si el primer nodo (inicio), no apunta a otro nodo.
     */
    public boolean esVacia(){
        return inicio == null;
    }
    /**
     * Consulta cuantos elementos (nodos) tiene la lista.
     * @return numero entero entre [0,n] donde n es el numero de elementos
     * que contenga la lista.
     */
    public int getTamanio(){
        return tamanio;
    }
    /**
     * Agrega un nuevo nodo al final de la lista.
     * @param persona
     */
    public void agregarAlFinal(Persona persona){
        // Define un nuevo nodo.
        NodoLista nuevo = new NodoLista();
        // Agrega al valor al nodo.
        nuevo.setValor(persona);
        // Consulta si la lista esta vacia.
        if (esVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            inicio = nuevo;
        // Caso contrario recorre la lista hasta llegar al ultimo nodo
        //y agrega el nuevo.
        } else{
            // Crea ua copia de la lista.
            NodoLista aux = inicio;
            // Recorre la lista hasta llegar al ultimo nodo.
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            // Agrega el nuevo nodo al final de la lista.
            aux.setSiguiente(nuevo);
        }
        // Incrementa el contador de tamaño de la lista
        tamanio++;
    }

     public void listar(){
        // Verifica si la lista contiene elementoa.
        if (!esVacia()) {
            // Crea una copia de la lista.
            NodoLista aux = inicio;
            // Posicion de los elementos de la lista.
            int i = 1;
            // Recorre la lista hasta el final.
            while(aux != null){
                // Imprime en pantalla el valor del nodo.
                System.out.println("\n[ " + i + " " + aux.getValor().toString() + " ]");
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
                // Incrementa el contador de la posión.
                i++;
            }
        }
    }
     public String[] pasaNombresArreglo(Lista datos){
         String []nombres = new String[datos.getTamanio()];
         NodoLista aux = inicio;
         int i = 0;
          while(aux != null){
                nombres[i] = aux.getValor().getNombre();
                aux = aux.getSiguiente();
                i++;
            }
          return nombres;
     }
     
     public String[] RemoverDupli(String[] nombres){
         int n = nombres.length;
         String[] nombresSinDuplicar = Arrays.copyOf(nombres, n);
         
         for(int i = 0; i < n; i++){
             int k = i + 1;
             int rem = 0;
             for(int j = i + 1; j < n; j++){
                 if(nombresSinDuplicar[j].equals(nombresSinDuplicar[i])){
                     rem++;
                 }else{
                     nombresSinDuplicar[k++] = nombresSinDuplicar[j];
                 }
             }
             n = n - rem;
         }
         nombresSinDuplicar = Arrays.copyOf(nombresSinDuplicar, n);
         return nombresSinDuplicar;
     }
}
