/*4. Tomando como referencia el ejercicio 4 de la tarea de escritura; desarrolle un
programa que lea el listado de placas e imprima en pantalla únicamente aquellas
que terminen en un número par.*/
package fileExcersices.Read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise04 {
    public static void main(String[] args) {
        BufferReaderClass();

    }

    public static void BufferReaderClass() {
        String directory = "D:\\respaldo\\Onedrive\\OneDrive - UNIVERSIDAD TÉCNICA DE AMBATO\\documentos\\1-U-SOFTWARE\\1 SEMESTRE\\ALGORTIMOS Y LOGICA DE PROGRAMACION\\plates.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(directory));
            String lines = "";
            int lastNumbers = 0;

            while (reader.ready()) {
                lines = reader.readLine();
                lastNumbers = Integer.parseInt(lines.substring(lines.length() - 2));

                if (lastNumbers % 2 == 0) {
                    System.out.println(lines);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}
