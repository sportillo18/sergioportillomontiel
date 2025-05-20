package ejercicio1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    	/*Se crea un objeto Scanner para leer por teclado.
			Se solicita el nombre del archivo al usuario.
			Se guarda en la variable nombreArchivo */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del archivo (sin espacios ni tildes y con .txt): ");
        String nombreArchivo = scanner.nextLine();

        /*Se llama al método escribirFrasesEnArchivo() para crear y escribir el archivo.
			Luego se llama a leerArchivoYContarPalabras() para mostrar su contenido y contar las palabras.*/
        
        GestorArchivo.escribirFrasesEnArchivo(nombreArchivo);
        GestorArchivo.leerArchivoYContarPalabras(nombreArchivo);
    }
}