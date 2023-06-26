public class PersonManager {
    private Person[] people;

    public PersonManager(Person[] people) {
        this.people = people;
    }

    public PersonManager(int numberOfPeople) {
        people = new Person[numberOfPeople];
    }

    public Person[] getPeople() {
        return people;
    }

    public boolean insert(Person person) {
        for (int i = 0; i < people.length; i++) {
            if (people[i] == null) {
                people[i] = person;
                return true;
            }
        }
        return false;
    }
    public void printAgeAverage() {
        int sum = 0;
        for (Person person : people) {
            sum += person.getEdad();
        }
        System.out.println("Edad promedio: " + sum / people.length);
    }

    public void printPeople() {
        for (Person person : people) {
            System.out.println(person);
        }
    }

}
