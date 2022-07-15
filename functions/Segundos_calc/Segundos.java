/*Defina una clase llamada “Segundos” en la cual debe contener varios métodos (al
menos 4 métodos) que realizarán el cálculo de segundos totales dependiendo de los
valores que se ingrese como argumentos (horas, minutos, segundos). Se debe
utilizar sobrecarga de métodos. Finalmente debe imprimir la conversión de las horas
y minutos ingresados, en segundos. */
package Segundos_calc;

import java.util.Scanner;

public class Segundos {
    public static void main(String[] args) {

        Calc calc = new Calc();
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Ingrese la cantidad de horas: ");
            int horas = sc.nextInt();
            System.out.println("Ingrese la cantidad de minutos: ");
            int minutos = sc.nextInt();
            System.out.println("Ingrese la cantidad de segundos: ");
            int segundos = sc.nextInt();
            sc.close();
            System.out.println("La cantidad de tiempo en segundos es: " + calc.segundosTotal(horas, minutos, segundos));

        } catch (Exception e) {
            System.out.println("Error los datos ingresados: " + e.getMessage());
        }

    }

}
