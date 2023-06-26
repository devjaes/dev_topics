import java.io.File;
import java.util.Scanner;

public class b_renameTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String directorio = "D:\\respaldo\\Onedrive\\OneDrive - UNIVERSIDAD TÉCNICA DE AMBATO\\documentos\\1-U-SOFTWARE\\1 SEMESTRE\\ALGORTIMOS Y LOGICA DE PROGRAMACION";
        System.out.println("Esta en el directorio: " + directorio);
        char confirm;
        String name = "";
        String extention = "";
        String newName = "";
        String newExtention = "";

        System.out.println("Deseas crear un archivo en este directorio (s/n)?");

        try {

            confirm = sc.next().charAt(0);
            if (confirm == 's') {
                System.out.println("Ingrese el nombre del archivo: ");
                name = sc.next();
                System.out.println("Ingrese la extencion del archivo: ");
                extention = sc.next();
                File file = new File(directorio + "\\" + name + "." + extention);

                if (file.exists()) {
                    System.out.println("El archivo ya existe");
                } else {
                    if (file.createNewFile()) {
                        System.out.println("Archivo creado");

                        System.out.println(
                                "Creaste el archivo: " + name + "." + extention + " en el directorio: " + directorio);
                        System.out.println("Deseas renombrar el archivo (s/n)?");
                        confirm = sc.next().charAt(0);

                        if (confirm == 's') {
                            System.out.println("Ingrese el nuevo nombre del archivo: ");
                            newName = sc.next();
                            System.out.println("Ingrese la extencion del archivo: ");
                            newExtention = sc.next();

                            if (file.renameTo(new File(directorio + "\\" + newName + "." + newExtention))) {
                                System.out.println("Archivo renombrado");
                            } else {
                                System.out.println("No se pudo renombrar");
                            }
                        } else {
                            System.out.println("No se renombro el archivo");
                        }
                    } else {
                        System.out.println("No se se pudo crear el archivo");
                    }
                }
            } else {
                System.out.println("No se creo el archivo");
            }

        } catch (Exception e) {
            System.out.println("Error");
        }
        sc.close();

    }
}
