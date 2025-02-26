public class PersonDemo {

    public static void main(String[] args) {
        // Create a Person object using the parameterized constructor
        Person person1 = new Person("Bob", 30);

        // Create a Person object using the default constructor
        Person person2 = new Person();

        // Display the information of both persons
        person1.displayPerson();
        person2.displayPerson();
    }
}

class Person {
    // Attributes
    String name;
    int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Method to display person information
    public void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}