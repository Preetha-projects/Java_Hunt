package CoreJava;

//Java does not allow implicit narrowing conversion (double → float) because it may lose precision.
//The var keyword - A type inference keyword ,was introduced in Java 10 (released in 2018).
//The var keyword lets the compiler automatically detect the type of variable based on the value you assign to it.

/*
Memory model:
   int x = 10;
   Stack: x → 10
*/

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        // Primitive Data Types
        int myInt = 10; // 4 bytes
        float myFloat = 3.14f; // 4 bytes : f is must becoz in Java, decimal numbers are treated as double by default.
        double myDouble = 3.14; // 8 bytes
        char myChar = 'A'; // 2 bytes : Character → Number → Binary → Stored in computer
        boolean myBoolean = true; // 1 byte

        // Non-primitive data types are called reference types because they refer to objects.
        String myString = "Hello, World!"; // Reference type  Array of character codes
        int[] myArray = {1, 2, 3, 4, 5}; // Reference type

        System.out.println("Integer: " + myInt);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBoolean);
        System.out.println("String: " + myString);
        System.out.print("Array: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }

        //int a = null;  Error: incompatible types: <null> cannot be converted to int

        Integer x = null;   //  Allowed

    }
}
