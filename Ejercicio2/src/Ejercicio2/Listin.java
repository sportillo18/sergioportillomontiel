package Ejercicio2;
import java.io.Serializable;

public class Listin implements Serializable {
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;

    public Listin(String nombre,String apellido, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: "+ apellido +", Dirección: " + direccion + ", Teléfono: " + telefono;
    }
}