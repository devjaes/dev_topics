import java.io.File;

public class String_list {
    public static void main(String[] args) {
        File file = new File(
                "D:\\respaldo\\Onedrive\\OneDrive - UNIVERSIDAD TÉCNICA DE AMBATO\\documentos\\1-U-SOFTWARE\\1 SEMESTRE\\ALGORTIMOS Y LOGICA DE PROGRAMACION");

        for (int i = 0; i < file.list().length; i++) {
            System.out.println(file.list()[i]);
        }

    }
}