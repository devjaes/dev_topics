package jaes;

import jaes.exercises.RomanNumber;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", "01/01/2000");
        System.out.println(person);

        Student student = new Student("Jane", "Doe", "01/01/2000", "123456", "Computer Science");
        System.out.println(student);

        RomanNumber romanNumber = new RomanNumber(1284);
        System.out.println(romanNumber.toRoman());
    }
}