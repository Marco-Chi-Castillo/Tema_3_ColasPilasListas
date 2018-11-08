
package ejercicio3;

public class Persona {
    private String nombre, edad, telefono, regalo;
    
    public Persona(String nombre, String edad, String telefono, String regalo) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.regalo = regalo;
    }
    
    public String toString(){
        return "Empleado" +
                "\nNombre: " + getNombre()+
                "\nEdad: " + getEdad() +
                "\nTelefono: " + getTelefono() +
                "\nRegalo: " + getRegalo();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRegalo() {
        return regalo;
    }

    public void setRegalo(String regalo) {
        this.regalo = regalo;
        
    } 
}
