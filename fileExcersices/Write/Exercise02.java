/*2. Desarrolle un programa que solicite 10 palabras ingresadas por teclado y las
almacene en un archivo. El programa debe cambiar las vocales que contenga cada
palabra ingresada por un guion bajo. */
package fileExcersices.Write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        String directory = "D:\\respaldo\\Onedrive\\OneDrive - UNIVERSIDAD TÉCNICA DE AMBATO\\documentos\\1-U-SOFTWARE\\1 SEMESTRE\\ALGORTIMOS Y LOGICA DE PROGRAMACION";
        Scanner sc = new Scanner(System.in);
        String words = "";

        System.out.println("Ingrese el nombre del archivo donde se guardará las palabras (su extensión será .txt)");
        String filename = sc.nextLine();
        File file = new File(directory + "\\" + filename + ".txt");

        try {
            FileWriter fw = new FileWriter(file);

            for (int i = 1; i <= 10; i++) {
                System.out.println("Ingrese la palabra " + i + ":");
                words = System.console().readLine().trim();
                words = words.replaceAll("[AEIOUaeiouÁÉÍÓÚáéíóú]", "_");
                fw.write(words + "\n");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
        sc.close();

    }
}
