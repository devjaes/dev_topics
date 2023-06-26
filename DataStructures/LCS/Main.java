package LCS;

public class Main {
    public static void main(String[] args) {

        CircleList<Person> list = new CircleList<>();
        list.prepend(new Person("John Doe", 20));
        list.prepend(new Person("Jane Doe", 19));
        list.prepend(new Person("John Smith", 21));
        list.prepend(new Person("Jane Smith", 22));

        list.removeEquals(new Person("John Doe", 20));

        Node<Person> current = list.head;

        for (int i = 0; i < list.size; i++, current = current.next) {
            System.out.println(current.data);

        }
    }
}
