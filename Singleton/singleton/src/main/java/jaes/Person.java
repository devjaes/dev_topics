package jaes;

public class Person {
    private String name;
    private String lastName;
    private String faculty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    private static Person instance;

    private Person(String name, String lastName, String faculty) {
        this.name = name;
        this.lastName = lastName;
        this.faculty = faculty;
    }

    public static Person getInstance(String name, String lastName, String faculty) {
        if (instance == null) {
            instance = new Person(name, lastName, faculty);
        }
        return instance;
    }

}
