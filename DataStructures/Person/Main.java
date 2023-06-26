import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Student("12345678", "Juan", LocalDate.of(2002, 1, 1), 8.5f);
        Person p2 = new Student("87654321", "Pedro", LocalDate.of(1995, 1, 1), 9.5f);
        Person p3 = new Teacher("12345678", "Ines", LocalDate.of(2003, 1, 1), 5);
        Person p4 = new Teacher("87654321", "Maria", LocalDate.of(1994, 1, 1), 10);
        Person p5 = new Student("12345678", "Jose", LocalDate.of(2001, 1, 1), 7.5f);

        PersonManager pm = new PersonManager(5);
        pm.insert(p1);
        pm.insert(p2);
        pm.insert(p3);
        pm.insert(p4);
        pm.insert(p5);

        pm.printPeople();
        pm.printAgeAverage();
    }
}
