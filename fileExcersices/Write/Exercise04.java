/*4. Desarrolle un programa que genere 100 placas de vehículos y las guarde en un
archivo. Cada placa se almacenará en una línea; Para ello utilizar la generación de
letras y de números aleatorios. La placa tendrá el siguiente formato: “AAA-0000”. El
número que conforma la placa consta de 4 dígitos. */
package fileExcersices.Write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {

        String directory = "D:\\respaldo\\Onedrive\\OneDrive - UNIVERSIDAD TÉCNICA DE AMBATO\\documentos\\1-U-SOFTWARE\\1 SEMESTRE\\ALGORTIMOS Y LOGICA DE PROGRAMACION";
        Scanner sc = new Scanner(System.in);
        String placa = "";
        String filename = "";
        char firsChar;
        char secondChar;
        char thirdChar;
        String numero1 = "";
        String numero2 = "";
        String numero3 = "";
        String numero4 = "";
        final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String NUMBERS = "0123456789";

        System.out.println(
                "Ingrese el nombre del archivo donde se guardarán las placas de los 100 vehículos (su extensión será .txt)");
        filename = sc.nextLine();
        File file = new File(directory + "\\" + filename + ".txt");

        try {
            FileWriter fw = new FileWriter(file);
            for (int i = 1; i <= 100; i++) {
                firsChar = LETTERS.charAt((int) (Math.random() * LETTERS.length()));
                secondChar = LETTERS.charAt((int) (Math.random() * LETTERS.length()));
                thirdChar = LETTERS.charAt((int) (Math.random() * LETTERS.length()));
                numero1 = NUMBERS.charAt((int) (Math.random() * NUMBERS.length())) + "";
                numero2 = NUMBERS.charAt((int) (Math.random() * NUMBERS.length())) + "";
                numero3 = NUMBERS.charAt((int) (Math.random() * NUMBERS.length())) + "";
                numero4 = NUMBERS.charAt((int) (Math.random() * NUMBERS.length())) + "";
                placa = firsChar + "" + secondChar + "" + thirdChar + "-" + numero1 + numero2 + numero3 + numero4;
                fw.write(placa + "\n");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
        sc.close();

    }
}