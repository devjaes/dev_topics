import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileRegister {
    public void createFile(String ruta) {
        String subruta = ruta.substring(0, ruta.length() - 10);
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            File nombre = new File(subruta + "nombre.txt");
            BufferedWriter bwnombre = new BufferedWriter(new FileWriter(nombre));
            File edad = new File(subruta + "edad.txt");
            BufferedWriter bwedad = new BufferedWriter(new FileWriter(edad));
            File sueldo = new File(subruta + "sueldo.txt");
            BufferedWriter bwsueldo = new BufferedWriter(new FileWriter(sueldo));
            File tipo = new File(subruta + "tipo.txt");
            BufferedWriter bwtipo = new BufferedWriter(new FileWriter(tipo));
            String name = "", age = "", salarie = "", type = "";

            while (br.ready()) {
                String linea = br.readLine();
                int a = 0, b = 0, c = 0, count = 0;
                for (int i = 0; i < linea.length(); i++) {

                    if (linea.charAt(i) == ';') {
                        count++;
                        switch (count) {
                            case 1:
                                a = i;
                                break;
                            case 2:
                                b = i;
                                break;
                            case 3:
                                c = i;

                                break;
                        }
                    } else {
                        continue;
                    }
                } // end for
                name = linea.substring(0, a);
                age = linea.substring((a + 1), b);
                salarie = linea.substring((b + 1), c);
                type = linea.substring(c + 1);
                bwnombre.write(name + "\n");
                bwedad.write(age + "\n");
                bwsueldo.write(salarie + "\n");
                bwtipo.write(type + "\n");
            } // end while
            bwnombre.close();
            bwedad.close();
            bwsueldo.close();
            bwtipo.close();
            br.close();

        } catch (IOException e) {
            System.out.println("Error" + e);
        }
    }

    public static void main(String[] args) {
        fileRegister fr = new fileRegister();
        fr.createFile(
                "D:\\respaldo\\Onedrive\\OneDrive - UNIVERSIDAD TÉCNICA DE AMBATO\\documentos\\1-U-SOFTWARE\\1 SEMESTRE\\ALGORTIMOS Y LOGICA DE PROGRAMACION\\EXERCISES\\GrupoA.csv");

    }
}
