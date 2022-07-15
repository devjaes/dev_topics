/*5. Tomando como referencia el ejercicio 5 de la tarea de escritura: desarrolle un
programa que imprima a los alumnos en donde su promedio sea mayor a 8.*/
package Read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise05 {
    public static void main(String[] args) {
        BufferReaderClass();

    }

    public static void BufferReaderClass() {
        String directory = "D:\\respaldo\\Onedrive\\OneDrive - UNIVERSIDAD TÉCNICA DE AMBATO\\documentos\\1-U-SOFTWARE\\1 SEMESTRE\\ALGORTIMOS Y LOGICA DE PROGRAMACION\\grades.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(directory));
            String lines = "";
            Double average = 0.0;
            String subName = "";

            while (reader.ready()) {
                lines = reader.readLine();
                average = Double.parseDouble(lines.substring(lines.lastIndexOf(';') + 1));
                subName = lines.substring(0, lines.indexOf(';'));

                if (average > 8) {
                    System.out.println(subName + " tiene un promedio mayor a 8 de: " + average);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
