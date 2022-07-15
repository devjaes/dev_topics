package Ejercicio05;

public class Horario {
    private int horas;
    private int dias;
    private int meses;
    private int anios;

    public Horario(int horas, int dias, int meses, int anios) {
        this.horas = horas;
        this.dias = dias;
        this.meses = meses;
        this.anios = anios;
    }

    public int totalHoras() {
        return horas * dias * 4 * meses * anios;
    }

    public int getHorasAnio() {
        return horas * dias * 4 * meses;
    }

    public int getHorasMes() {
        return horas * dias * 4;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

}
