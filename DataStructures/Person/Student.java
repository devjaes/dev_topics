import java.time.LocalDate;

public class Student extends Person {
    private float gradeAverage;

    public Student(String dni, String name, LocalDate birthDate, float gradeAverage) {
        super(dni, name, birthDate);
        this.gradeAverage = gradeAverage;
    }

    public float getGradeAverage() {
        return gradeAverage;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                ", promedio_calificaciones=" + gradeAverage +
                '}';
    }
}
