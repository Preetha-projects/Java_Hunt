package CoreJava.OOPS;

/*
A constructor is a special method:

    Has the same name as the class
    Has no return type
    Is called automatically when object is created
    Used to initialize object state

 | Parent Constructor        | Child Requirement                 |
| ------------------------- | --------------------------------- |
| No constructor (default)  | Nothing, default `super()` called |
| No-arg constructor        | Nothing, default `super()` called |
| Parameterized constructor | Must call `super(...)` explicitly |

 */
public class Constructor {

    String name;
    int age;

    //1. Default constructor If you don’t write any constructor, Java provides a default constructor automatically.
    //But if you write even one constructor manually → Java will NOT create default one.
    public Constructor() {
        this.name = "Unknown";
        this.age = 0;
        System.out.println("Default constructor called");
    }

    //2. Parameterized constructor - allows you to set initial values at object creation
    public Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //3. Copy constructor - creates a new object by copying an existing object
    public Constructor(Constructor other) {
        this.name = other.name;
        this.age = other.age;
    }

    //4. Private constructor - To restrict object creation. It is commonly used in Singleton pattern, utility classes (Math class in Java)
    //  and factory design patterns where object creation needs to be controlled.
    // we cannot create obj---> Math k = new Math(); because of private constructor
    private Constructor(String name) {
        this.name = name;
        this.age = 0;
    }

    //Constructor overloading - multiple constructors with different parameter lists
    public Constructor(String name, int age, String extra) {
        this.name = name;
        this.age = age;
        extra="Extra parameter for demonstration";
        }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor(); // Default constructor
        c1.displayInfo();

        Constructor c2 = new Constructor(); // Default constructor

        Constructor c3 = new Constructor("Alice", 30); // Parameterized constructor
        c3.displayInfo();

        Constructor c4 = new Constructor(c1); // Copy constructor
        c4.displayInfo();  //only name and age will be copied, not the extra parameter

    }
}

class Singleton {

    private static Singleton instance;

    private Singleton() { }

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
            System.out.println("Creating new instance");
        }
        return instance;
    }

    public static void main(String[] args) {
        // output will be "Creating new instance" only once, even though we call getInstance() twice,
        // because the second time it returns the already created instance.
        //use case : to control access to shared resources (DB, file system, network)
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
    }
}
