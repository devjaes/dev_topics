package jaes;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Person person1 = Person.getInstance("Juan", "Perez", "Engineering");
        Person person2 = Person.getInstance("Maria", "Lopez", "Medicine");

        System.out.println(person1.getName());
        System.out.println(person1.getLastName());
        System.out.println(person1.getFaculty());

        System.out.println(person2.getName());
        System.out.println(person2.getLastName());
        System.out.println(person2.getFaculty());
    }
}
