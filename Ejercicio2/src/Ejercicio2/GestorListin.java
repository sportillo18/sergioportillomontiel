package Ejercicio2;
import java.io.*;

public class GestorListin {

    public static void guardarListinEnArchivo(Listin[] lista, String nombreArchivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            for (Listin item : lista) {
                oos.writeObject(item);
            }
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public static void leerListinDesdeArchivo(String nombreArchivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            System.out.println("Contenido del Listín desde archivo binario:");
            while (true) {
                try {
                    Listin item = (Listin) ois.readObject();
                    System.out.println(item);
                } catch (EOFException e) {
                    break; // Fin del archivo
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}