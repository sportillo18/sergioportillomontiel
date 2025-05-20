package Ejercicio2;
import java.util.Scanner;

public class PrincipalListin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Listin[] lista = new Listin[2];

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Introduce los datos del contacto " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();

            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine();

            lista[i] = new Listin(nombre, apellido, direccion, telefono);
        }

        String nombreArchivo = "sergioportillomontielListin.bin"; 
        GestorListin.guardarListinEnArchivo(lista, nombreArchivo);
        GestorListin.leerListinDesdeArchivo(nombreArchivo);
    }
}