package jaes;

public class Student extends Person {
    private String studentId;
    private String career;

    public Student(String name, String lastname, String birthdate, String studentId, String career) {
        super(name, lastname, birthdate);
        this.studentId = studentId;
        this.career = career;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCareer() {
        return career;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", lastname='" + getLastname() + '\'' +
                ", birthdate='" + getBirthdate() + '\'' +
                ", studentId='" + studentId + '\'' +
                ", career='" + career + '\'' +
                '}';
    }

}
