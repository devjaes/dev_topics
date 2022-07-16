package functions.Ejercicio05;

import java.time.LocalDate;

public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private LocalDate dt;

    public Empleado(String nombre, String apellido, int edad, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }

    public int countVocalesNombre() {
        int contador = 0;
        for (int i = 0; i < nombre.length(); i++) {
            if (nombre.charAt(i) == 'a' || nombre.charAt(i) == 'e' || nombre.charAt(i) == 'i' || nombre.charAt(i) == 'o'
                    || nombre.charAt(i) == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public int getAnioNacimiento() {
        dt = LocalDate.now();
        return (dt.getYear() - edad);
    }

    public int countVocalesApellido() {
        int contador = 0;
        for (int i = 0; i < apellido.length(); i++) {
            if (apellido.charAt(i) == 'a' || apellido.charAt(i) == 'e' || apellido.charAt(i) == 'i'
                    || apellido.charAt(i) == 'o' || apellido.charAt(i) == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

}
