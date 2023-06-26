import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String dni;
    private String name;
    private LocalDate birthDate;

    public Person(String dni, String name, LocalDate birthDate) {
        this.dni = dni;
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getEdad() {
        return Period.between(birthDate, LocalDate.now()).getYears();

    }

    @Override
    public String toString() {
        return "cedula='" + dni + '\'' +
                ", nombre='" + name + '\'' +
                ", fecha_Nacimiento=" + birthDate + '\'' +
                ", edad=" + getEdad();
    }
}