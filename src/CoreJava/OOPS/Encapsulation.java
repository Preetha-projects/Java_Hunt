package CoreJava.OOPS;
/*
Encapsulation is the process of binding data and methods together inside a class
and restricting direct access to the data by making variables private and
providing controlled access (public getter and setter methods).

Encapsulation = Data hiding + controlled access

In Java, encapsulation is implemented using:
    -private variables
    -public methods (getters & setters)
    -Optional validation logic inside setters --> Encapsulation becomes powerful when you add rules. Ensures data integrity.

Setter/Getter:
Simple DTO → Use Lombok
Business logic class → Manual setters with validation

 */
public class Encapsulation {

    //Fields are private
    private String username;
    private String pwd;
    private int age;

    // Access through public methods
    // Validation logic present
    // Object protected from invalid stat
    public void setUsername(String username) {
        if (username != null && !username.isEmpty()) {
            this.username = username;
        } else {
            System.out.println("Username cannot be empty");
        }
    }

    //getter method to access private variable, can use Lombok @Getter for this
    public String getUsername() {
        return username;
    }

    public void setPwd(String pwd) {
        if (pwd != null && pwd.length() >= 8) {
            this.pwd = pwd;
        } else {
            System.out.println("Password must be at least 8 characters");
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            //Instead of printing errors, better to throw exception:
            System.out.println("Age must be 18 or above");  //throw new IllegalArgumentException("Age must be 18 or above");
        }
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Encapsulation user = new Encapsulation();
        user.age= 30; //Can access private variable directly inside same class, but not outside. This is why we use private, to restrict access from outside the class.
    }
}

class TestClass {
    public static void main(String[] args) {
        Encapsulation user = new Encapsulation();
        user.setUsername("Preetha");
        user.setPwd("password123");
        user.setAge(23);

        System.out.println("Username: "+ user.getUsername());
        System.out.println("Password: "+ user.getPwd());
        System.out.println("Age: "+ user.getAge());

        // Attempting to set invalid data
        user.setAge(15);  // Will print error message, age remains unchanged

        //user.age(15); // Cannot access private variable directly, will cause compilation error
    }
}


