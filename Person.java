public class Person {
    // Attributes of the Person class
    private String name;
    private String lastname;
    private int age;
    private String birthplace;

    // Constructor to initialize the attributes
    public Person(String name, String lastname, int age, String birthplace) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.birthplace = birthplace;
    }

    // Method to display person's information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Lastname: " + lastname);
        System.out.println("Age: " + age);
        System.out.println("Birthplace: " + birthplace);
    }
}