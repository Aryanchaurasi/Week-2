public class Person {
    private String name;
    private int age;
    private String address;

    // Default constructor
    public Person() 
    {
        name="Aryan";
        age=19;
        address="Ballia,U.P.";
    }

    // Parameterized constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.address = other.address;
    }
    
    
    public void display() {
        System.out.println( "Person name='" + name + " and  age= " + age + " with address= " + address );
    }

    // Main method to demonstrate the copy constructor
    public static void main(String[] args) 
    {
        Person original = new Person("Aryan", 20, "Ballia UP");
        Person clone = new Person(original);
        System.out.println("this is the orignal parameterised constructor");
        original.display();
        System.out.println("this is the clone of  parameterised constructor or copy constructor");
        clone.display();
    }
}
