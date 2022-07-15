/*2. Tomando como referencia el ejercicio 2 de la tarea de escritura; desarrolle un
programa que cuente la cantidad de guiones que contiene cada cadena e imprima
en pantalla. */
package Read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise02 {
    public static void main(String[] args) {
        BufferReaderClass();

    }

    public static void BufferReaderClass() {
        String directory = "D:\\respaldo\\Onedrive\\OneDrive - UNIVERSIDAD TÉCNICA DE AMBATO\\documentos\\1-U-SOFTWARE\\1 SEMESTRE\\ALGORTIMOS Y LOGICA DE PROGRAMACION\\words.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(directory));
            int word = 0;
            int count = 0;
            String lines = "";

            while (reader.ready()) {
                lines = reader.readLine();
                word = lines.length();
                for (int i = 0; i < word; i++) {
                    if (lines.charAt(i) == '_') {
                        count++;
                    }
                }
                System.out.println(lines + " tiene " + count + " guiones");
                count = 0;
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}
