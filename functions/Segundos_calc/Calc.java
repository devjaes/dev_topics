package functions.Segundos_calc;

public class Calc {
    public int segundosTotal(int horas, int minutos, int segundos) {
        return horas * 3600 + minutos * 60 + segundos;
    }

    public int segundosTotal(int horas, int minutos) {
        return horas * 3600 + minutos * 60;
    }

    public int segundosTotal(int horas) {
        return horas * 3600;
    }

}
