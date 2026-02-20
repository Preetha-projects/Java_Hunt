package CoreJava;

import java.util.Objects;

//String will create a new object in the string pool memory area
//String is immutable in nature, once created it cannot be changed, it will be available for garbage collection if there is no reference pointing to it.

/*
When strings are compared:
If reference comparison: ==
👉 Memory addresses are checked.

If content comparison: .equals()
👉 Length check
👉 Character-by-character comparison
👉 Stops at first mismatch
 */

public class StringsRelated {
    public static void main(String[] args) {
        String var0 = "Happy"; //new obj is created in string pool
      //  var0 = "Birthday"; //new obj is created in string pool, previous "Happy" obj is now eligible for garbage collection
        String var1 = "Happy"; //no new obj is created, reference is pointing to existing "Happy" obj in string pool
        System.out.println(var0);

        // "==" compares the references of the objects
        if(var0 == var1); // condition is true because both references point to same object in string pool

        String var2 = new String("Happy"); //new obj is created in heap memory
        String var3 = new String("Happy"); //new obj is created in heap memory
        if(var2 == var3); // condition is false because both references point to different objects in heap memory

        int num1 = 29;
        int num2 = 29;
        if(num1 == num2); // condition is true because both are primitive types and values

        String var4 = new String("Javas");
        String var5 = new String("Javas");
        //.equals() belongs to objects and not for primitive types
        if(var4.equals(var5)); // condition is true because both objects have same content and equals() method compares content of the objects
        Objects.equals(var4, var5); // this is another way to compare content of the objects

        int num3 = 21;
        int num4 = 21;
       // if(num3.equals(num4)); incorrect because primitive types do not have methods

        Integer num5 = 21;
        Integer num6 = 21;
        if(num5.equals(num6)); // correct because Integer is a wrapper class
    }
}
