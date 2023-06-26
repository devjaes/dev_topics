import java.io.File;
import java.util.Scanner;

public class file_methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String directorio = "D:\\respaldo\\Onedrive\\OneDrive - UNIVERSIDAD TÉCNICA DE AMBATO\\documentos\\1-U-SOFTWARE\\1 SEMESTRE\\ALGORTIMOS Y LOGICA DE PROGRAMACION";
        System.out.println("Esta en el directorio: " + directorio);
        char confirm;
        String name = "";
        String browsername = "";
        String extention = "";
        String newName = "";
        String newExtention = "";
        int option = 0;
        File file;

        do {

            System.out.println("Qué deseas hacer?"
                    + "\n1. Crear un archivo"
                    + "\n2. Renombrar un archivo"
                    + "\n3. Listar archivos"
                    + "\n4. Salir");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Deseas crear un archivo en este directorio: " + directorio + "(s/n)?");

                    try {

                        confirm = sc.next().charAt(0);
                        if (confirm == 's') {
                            System.out.println("Ingrese el nombre del archivo: ");
                            name = sc.next();
                            System.out.println("Ingrese la extencion del archivo: ");
                            extention = sc.next();
                            file = new File(directorio + "\\" + name + "." + extention);

                            if (file.exists()) {
                                System.out.println("El archivo ya existe");
                            } else {
                                if (file.createNewFile()) {
                                    System.out.println("Archivo creado");

                                    System.out.println(
                                            "Creaste el archivo: " + name + "." + extention + " en el directorio: "
                                                    + directorio);

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

                    break;

                case 2:
                    System.out.println("Vas a renombrar un archivo en este directorio" + directorio);

                    try {
                        System.out.println("Ingrese el nombre del archivo que va a renombrar junto con su extensión: ");
                        browsername = sc.next();
                        file = new File(directorio + "\\" + browsername);

                        System.out.println("Ingrese el nuevo nombre del archivo: ");
                        newName = sc.next();
                        System.out.println("Ingrese la nueva extencion del archivo: ");
                        newExtention = sc.next();

                        if (file.renameTo(new File(directorio + "\\" + newName + "." + newExtention))) {
                            System.out.println("Archivo renombrado");
                        } else {
                            System.out.println("No se pudo renombrar");
                        }
                    } catch (Exception e) {
                        System.out.println("Error");
                    }

                    break;

                case 3:
                    System.out.println("Listando archivos en el directorio: " + directorio);
                    File[] files = new File(directorio).listFiles();

                    for (int i = 0; i < files.length; i++) {
                        System.out.println(files[i].getName());
                    }

                    break;

                case 4:
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("Opción no valida");
                    break;
            }
        } while (option != 4);
        sc.close();
    }
}
