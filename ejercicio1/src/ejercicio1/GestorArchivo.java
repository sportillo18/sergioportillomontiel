package ejercicio1;
import java.io.BufferedReader; //permiten leer archivos de forma eficiente.
import java.io.BufferedWriter;//permiten escribir archivos de forma eficiente.
import java.io.FileReader;//se utilizan para abrir archivos en modo lectura.
import java.io.FileWriter;//se utilizan para abrir archivos en modo escritura.
import java.io.IOException;//es una clase de excepción para manejar errores de entrada/salida

public class GestorArchivo {

    static String[] frases = { //Se declara un array estático de tipo String llamado frases con 5 frases. Este array se va a guardar en el archivo de texto
        "El sol brilla intensamente hoy.",
        "Me gusta aprender cosas nuevas cada día.",
        "La programación es una habilidad muy útil.",
        "A veces, los errores enseñan más que los aciertos.",
        "Leer libros expande la mente."
    };

    public static void escribirFrasesEnArchivo(String nombreArchivo) { //Método estático y público que escribe las frases en el archivo.Recibe como parámetro el nombre del archivo.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (String frase : frases) {
                writer.write(frase);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage()); //Si ocurre un error de escritura puede crearse), se imprime el mensaje de error.
        }
    }

    public static void leerArchivoYContarPalabras(String nombreArchivo) { 
    	/*Método público y estático que:
    	 	Lee el contenido del archivo.
			Lo muestra por consola.
			Cuenta el total de palabras. */
        int contadorPalabras = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
                String[] palabras = linea.trim().split("\\s+");
                contadorPalabras += palabras.length;
            }
            System.out.println("\nNúmero total de palabras: " + contadorPalabras);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
