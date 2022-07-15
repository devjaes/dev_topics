/*3. Tomando como referencia el ejercicio 3 de la tarea de escritura; desarrolle un
programa que cuente la cantidad de arroba (@), la cantidad de números 3 y la
cantidad de ceros que contienen todas las cadenas. Imprima los totales en pantalla. */

package Read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise03 {
    public static void main(String[] args) {
        BufferReaderClass();

    }

    public static void BufferReaderClass() {
        String directory = "D:\\respaldo\\Onedrive\\OneDrive - UNIVERSIDAD TÉCNICA DE AMBATO\\documentos\\1-U-SOFTWARE\\1 SEMESTRE\\ALGORTIMOS Y LOGICA DE PROGRAMACION\\3caseWords.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(directory));
            int word = 0;
            int counta = 0;
            int counte = 0;
            int counto = 0;
            String lines = "";

            while (reader.ready()) {
                lines = reader.readLine();
                word = lines.length();
                for (int i = 0; i < word; i++) {
                    if (lines.charAt(i) == '@') {
                        counta++;
                    }
                    if (lines.charAt(i) == '3') {
                        counte++;
                    }
                    if (lines.charAt(i) == '0') {
                        counto++;
                    }
                }
                System.out.println(lines + " tiene:");
                System.out.println(counta + " arrobas (@)");
                System.out.println(counte + " numeros tres (3)");
                System.out.println(counto + " números cero (0)");
                counta = 0;
                counte = 0;
                counto = 0;
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
}
