package Ejercicio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nombre, apellido;
        int edad, dni;
        int sueldobase;
        System.out.println("Ingrese el nombre: ");
        nombre = scan.nextLine();
        System.out.println("Ingrese el apellido: ");
        apellido = scan.nextLine();
        System.out.println("Ingrese la edad: ");
        edad = scan.nextInt();
        System.out.println("Ingrese el dni: ");
        dni = scan.nextInt();
        Empleado empleado = new Empleado(nombre, apellido, edad, dni);

        System.out.println("Ingrese el sueldo base: ");
        sueldobase = scan.nextInt();
        Sueldo sueldo = new Sueldo(sueldobase);
        sueldo.setHorario();
        scan.close();

        Horario horario = new Horario(sueldo.horario.getHoras(), sueldo.horario.getDias(), sueldo.horario.getMeses(),
                sueldo.horario.getAnios());

        System.out.println(
                "Las vocales de " + empleado.getNombre() + " en su nombre son: " + empleado.countVocalesNombre());
        System.out.println(
                "Las vocales de " + empleado.getNombre() + " en su apellido son: " + empleado.countVocalesApellido());
        System.out.println("El año de nacimiento de " + empleado.getNombre() + " está entre los años: "
                + (empleado.getAnioNacimiento() - 1) + " y " + empleado.getAnioNacimiento() + " y "
                + (empleado.getAnioNacimiento() + 1));
        System.out.println("El total de horas trabajadas es: " + horario.totalHoras());
        System.out.println("La cantidad de horas al mes es: " + horario.getHorasMes());
        System.out.println("La cantidad de horas al año es: " + horario.getHorasAnio());
        System.out.println("El sueldo total es: " + sueldo.getSueldoTotal());
        System.out.println("El sueldo por hora es: " + sueldo.sueldoHoras());
        System.out.println("El sueldo por año es: " + sueldo.sueldoAnio());

    }

}
