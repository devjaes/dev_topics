package Ejercicio05;

import java.util.Scanner;

public class Sueldo extends Horario {
    private int sueldoTotal;
    private int sueldoBase;
    private int sueldoHoras;
    private int sueldoAnio;
    public Horario horario;
    public Scanner sc;
    public int horas;
    public int dias;
    public int meses;
    public int anios;

    public Sueldo(int sueldoBase) {
        super(0, 0, 0, 0);
        this.sueldoBase = sueldoBase;
    }

    public void setHorario() {
        sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas que trabajará  al día: ");
        horas = sc.nextInt();
        System.out.println("Ingrese la cantidad de días que trabajará  a la semana: ");
        dias = sc.nextInt();
        System.out.println("Ingrese la cantidad de meses que trabajará  al año: ");
        meses = sc.nextInt();
        System.out.println("Ingrese la cantidad de años que trabajará: ");
        anios = sc.nextInt();
        sc.close();
        horario = new Horario(horas, dias, meses, anios);

    }

    public int getSueldoTotal() {
        if (horario.getHoras() > 8) {
            sueldoBase += 20;
            sueldoHoras = sueldoBase / (horario.getHoras());
            sueldoTotal = sueldoHoras * (horario.totalHoras());
            return sueldoTotal;
        } else {
            sueldoHoras = sueldoBase / (horario.getHoras());
            sueldoTotal = sueldoHoras * (horario.totalHoras());
            return sueldoBase;
        }
    }

    public int sueldoHoras() {
        if (horario.getHoras() > 8) {
            sueldoBase += 20;
            sueldoHoras = sueldoBase / (horario.getHoras());
            return sueldoHoras;
        } else {
            sueldoHoras = sueldoBase / (horario.getHoras());
            return sueldoHoras;
        }
    }

    public int sueldoAnio() {
        if (horario.getHoras() > 8) {
            sueldoBase += 20;
            sueldoHoras = sueldoBase / (horario.getHoras());
            sueldoAnio = sueldoHoras * (horario.getHorasAnio());
            return sueldoAnio;
        } else {
            sueldoHoras = sueldoBase / (horario.getHoras());
            sueldoAnio = sueldoHoras * (horario.getHorasAnio());
            return sueldoAnio;

        }
    }

}
