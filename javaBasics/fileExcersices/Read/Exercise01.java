/*1. Tomando como referencia el ejercicio 1 de la tarea de escritura; desarrolle un
programa que lea el listado de nombres e imprima la longitud de caracteres de cada
uno de los nombres. */
package fileExcersices.Read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise01 {
    public static void main(String[] args) {
        BufferReaderClass();

    }

    public static void BufferReaderClass() {
        String directory = "D:\\respaldo\\Onedrive\\OneDrive - UNIVERSIDAD TÉCNICA DE AMBATO\\documentos\\1-U-SOFTWARE\\1 SEMESTRE\\ALGORTIMOS Y LOGICA DE PROGRAMACION\\names.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(directory));
            String lines = "";
            int length;

            while (reader.ready()) {
                lines = reader.readLine();
                length = lines.length();
                System.out.println(lines + " tiene " + length + " caracteres");
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}
