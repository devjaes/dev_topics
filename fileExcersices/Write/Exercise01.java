/*1. Desarrolle un programa que solicite 10 nombres de personas ingresadas por teclado
y almacene en un archivo. El programa debe transformar la primera letra del nombre
a mayúscula. Cada registro estará almacenado en una línea. */
package fileExcersices.Write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        String directory = "D:\\respaldo\\Onedrive\\OneDrive - UNIVERSIDAD TÉCNICA DE AMBATO\\documentos\\1-U-SOFTWARE\\1 SEMESTRE\\ALGORTIMOS Y LOGICA DE PROGRAMACION";
        Scanner sc = new Scanner(System.in);
        String names = "";
        String filename = "";
        String firsChar = "";
        String restChar = "";

        System.out.println(
                "Ingrese el nombre del archivo donde se guardará los nombres de las 10 personas (su extensión será .txt)");
        filename = sc.nextLine();
        File file = new File(directory + "\\" + filename + ".txt");

        try {
            FileWriter fw = new FileWriter(file);

            for (int i = 1; i <= 10; i++) {
                System.out.println("Ingrese el nombre de la persona " + i + ":");
                names = System.console().readLine().trim();
                firsChar = names.substring(0, 1);
                restChar = names.substring(1, names.length());
                fw.write(firsChar.toUpperCase() + restChar.toLowerCase() + "\n");
            }

            fw.close();

        } catch (IOException e) {
            System.out.println("Error"+e);
        }
        sc.close();

    }

}