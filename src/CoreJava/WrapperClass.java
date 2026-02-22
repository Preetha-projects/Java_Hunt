package CoreJava;

/*
What is a Wrapper Class?
A wrapper class is a class in Java that converts a primitive data type into an object.
Wrapper classes provide an object representation of primitive data types.

Why Is It Needed?
Wrapper classes are needed because Java collections work only with objects, not primitive types.
It allows null values
provides utility methods for converting between types and parsing strings.

- byte → Byte
- short → Short
- int → Integer
- long → Long
- float → Float
- double → Double
- char → Character
- boolean → Boolean

 */

/*
Memory model:
   Integer e = 10;

   Stack: e → reference
   Heap: [Integer object]
    value = 10

*/

import java.net.Proxy;

public class WrapperClass {

    public static void main(String[] args) {

        // 1. Autoboxing: primitive int -> Integer object
        int b = 357;
        Integer a = b;  //Integer a = Integer.valueOf(b) is called behind the scenes to convert the primitive int to an Integer object.

        System.out.println("The primitive int b is: " + b);
        System.out.println("The Integer object a is: " + a);

        //2. Unboxing: Integer object -> primitive int
        Integer i = 20;
        int unboxedInt = i; // int unboxedInt = i.intValue() is called behind the scenes to convert the Integer object back to a primitive int.
        System.out.println("Unboxed Integer: " + unboxedInt);

        // Integer.valueOf() :
        // Converts a primitive int into an Integer object
        // AND uses the Integer cache if possible.

        //3. Integer Caching: Java caches Integer objects for values between -128 and 127. When you create an Integer object with a value in this range, it returns a reference to the cached object instead of creating a new one. This is done to improve performance and reduce memory usage.
        Integer e = 10;
        Integer f = 10;
        System.out.print("Internal caching: ");
        System.out.println(e==f);  // true because of Integer caching, a and b refer to the same object in memory.

        Integer c = 128;
        Integer d = 128;
        System.out.print("Not in internal chching range, new obj created so : ");
        System.out.println(c==d);   // false because c and d are different objects, Java creates a new Integer object in heap.

        Integer y = new Integer(10);
        Integer z = new Integer(10);
        System.out.print("Two new objects created using new keyword: ");
        System.out.println(y==z);   // false because y and z are different objects in memory, even though they have the same value.
        System.out.println(y.equals(z)); // true because equals() method compares the values of the objects, and both y and z have the same value of 10.
        System.out.println("Using compareTo() to compare num1 and num2: " + y.compareTo(z)); // 0 because compareTo() returns 0 when the values are equal, a negative number if num1 is less than num2, and a positive number if num1 is greater than num2.

        //4. Wrapper classes provide utility methods for converting between types and parsing strings.
        String strNum = "123";
        int parsedNum = Integer.parseInt(strNum); // Converts the string "123" to the primitive int 123
        System.out.println("Parsed number: " + parsedNum);

        Integer stringInt = 123;
        System.out.println("String representation of Integer 123: " + stringInt.toString());

        //5. Wrapper classes are immutable, meaning their values cannot be changed after they are created. Any operation that seems to modify a wrapper object actually creates a new object.
        Integer original = 5;
        Integer modified = original + 10; // This creates a new Integer object with the value 15, and original remains unchanged.
        System.out.println("Original Integer: " + original);
        System.out.println("Modified Integer: " + modified);

        //6. Wrapper classes can also be used to represent the minimum and maximum values for primitive types, using constants like MIN_VALUE and MAX_VALUE.
        System.out.println("Minimum value for Integer: " + Integer.MIN_VALUE);
        System.out.println("Maximum value for Integer: " + Integer.MAX_VALUE);

    }

}
