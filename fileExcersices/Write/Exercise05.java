/*Desarrolle un programa que solicite el nombre, la nota del primer parcial y la nota
del segundo parcial. La nota final de cada alumno será el promedio de las dos notas
solicitadas previamente (primer y segundo parcial). La cantidad de alumnos a
ingresar se ingresará por teclado. Almacenar en un archivo la información de todos
los alumnos ingresados por teclado, en donde la información de cada alumno estará
en una línea separada por un punto y coma “;”. */
package fileExcersices.Write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        String directory = "D:\\respaldo\\Onedrive\\OneDrive - UNIVERSIDAD TÉCNICA DE AMBATO\\documentos\\1-U-SOFTWARE\\1 SEMESTRE\\ALGORTIMOS Y LOGICA DE PROGRAMACION";
        Scanner sc = new Scanner(System.in);
        String student = "";
        String filename = "";
        Double firstNote = 0.0;
        Double secondNote = 0.0;
        Double average = 0.0;
        int numberOfStudents = 0;

        System.out.println(
                "Ingrese el nombre del archivo donde se guardará la información de los estudiantes junto con las notas (su extensión será .txt)");
        filename = sc.nextLine();
        File file = new File(directory + "\\" + filename + ".txt");
        do {
            System.out.println("Ingrese el número de estudiantes que va a ingresar:");
            numberOfStudents = Integer.parseInt(sc.nextLine());
        } while (numberOfStudents < 0);

        try {
            FileWriter fw = new FileWriter(file);
            for (int i = 1; i <= numberOfStudents; i++) {
                System.out.println("Ingrese el nombre del estudiante " + i + ":");
                student = sc.nextLine();
                do {
                    System.out.println("Ingrese la nota 1 del estudiante " + i + ":");
                    firstNote = Double.parseDouble(sc.nextLine());
                } while (firstNote < 0 || firstNote > 10);
                do {
                    System.out.println("Ingrese la nota 2 del estudiante " + i + ":");
                    secondNote = Double.parseDouble(sc.nextLine());
                } while (secondNote < 0 || secondNote > 10);
                average = (firstNote + secondNote) / 2;
                fw.write(student + ";" + firstNote + ";" + secondNote + ";" + average + "\n");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
        sc.close();
    }
}
