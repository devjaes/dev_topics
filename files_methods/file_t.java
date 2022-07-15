import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_t {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String directorio = "D:\\respaldo\\Onedrive\\OneDrive - UNIVERSIDAD TÉCNICA DE AMBATO\\documentos\\1-U-SOFTWARE\\1 SEMESTRE\\ALGORTIMOS Y LOGICA DE PROGRAMACION";
        System.out.println("Ingrese el nombre del archivo");
        String nombre = sc.nextLine();
        File archivo = new File(directorio + "\\" + nombre);
        String nombres = "";
        int edad = 0;
        try {
            FileWriter fw = new FileWriter(archivo);
            for (int i = 1; i <= 5; i++) {
                System.out.println("Ingrese el nombre de la " + i + "persona");
                nombres = sc.nextLine();
                System.out.println("Ingrese la edad de la " + i + "persona");
                edad = sc2.nextInt();
                fw.write(nombres + ";" + edad + "\n");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
        sc.close();
        sc2.close();
    }
}
