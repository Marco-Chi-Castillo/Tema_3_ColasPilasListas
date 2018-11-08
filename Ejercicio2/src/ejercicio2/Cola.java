
package ejercicio2;

public class Cola {
    NodoCola inicio, fin;
    int tamanio = 0;
    public Cola(){
        inicio = fin = null;
        tamanio =0;
    }
    
    public boolean EstaVacia(){
        return inicio ==null;
    }
    
    public void insertar(int ele){
        NodoCola nuevo = new NodoCola(ele);
        if(EstaVacia()){
            inicio = nuevo;
        }else{
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tamanio++;
    }
    
    public void MostrarCola(){
          // Crea una copia de la pila.
        NodoCola aux = inicio;
        // Recorre la pila hasta el ultimo nodo.
        while(aux != null){
            System.out.print("| " + aux.dato + " |\t");
            //System.out.println("-----------------");
            aux = aux.siguiente;
        }
    }
    
}
