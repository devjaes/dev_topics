import java.time.LocalDate;

public class Teacher extends Person {
    private int experienceYears;

    public Teacher(String dni, String name, LocalDate birthDate, int experienceYears) {
        super(dni, name, birthDate);
        this.experienceYears = experienceYears;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                super.toString() +
                ", anios_experiencia=" + experienceYears +
                '}';
    }
}
