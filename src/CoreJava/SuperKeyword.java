package CoreJava;

class Parent {
    String message ="Hello from Parent";;

    Parent(String message) {
        System.out.println("Parent Constructor");
    }

    public void displayMessages() {
        System.out.println("Displayed from Parent");
    }
}

class Child extends Parent {
    String message = "Hello from Child";
    Child() {
        super("Rhea");   //commented we still get 2 statements printed because of implicit super() in Java
        System.out.println("Child Constructor");

//        Implicit super() in Java: If you don’t write super() explicitly,
//        Java automatically inserts it at the first line of the constructor if the parent has a no-argument constructor.
//        Java ensures parent object is always initialized first, even if you don’t write super() manually.
    }
    public void displayMessages() {
        super.displayMessages(); // Accessing parent method using super
        System.out.println("Displayed from Child");
    }

    public void printVariable() {
        System.out.println(message);  // child class variable
        System.out.println(super.message); // Accessing parent variable using super
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Child c = new Child(); //We just created the object… then how is it printing?
        //when you create an object using new, the constructor runs automatically.
        //Object creation = constructor execution.
        c.displayMessages();
        c.printVariable();

        Parent p = new Child(); // Parent reference, Child object
        System.out.println(p.message);// Accessing variable → based on reference type (Parent)
        p.displayMessages(); // Accessing method → based on object type (Child)
    }
}

