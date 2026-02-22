package CoreJava;

import java.util.Objects;

//String will create a new object in the string pool memory area
//String is immutable in nature, once created it cannot be changed, it will be available for garbage collection if there is no reference pointing to it.
//compile-time constants → stored in String Pool.

/*

Ways to Create a String:
1. Using String Literal (Recommended)

                String s1 = "Hello";

        -Stored in String Pool  -> Special memory area inside heap, Avoids duplicate objects, stores string literals.
        -Memory efficient

2. Using new Keyword

                String s2 = new String("Hello");

        -Creates object in heap
        -Even if same value exists in pool, new object is created


When strings are compared:
If reference comparison: ==
👉 Memory addresses are checked.

If content comparison: .equals()
👉 Length check
👉 Character-by-character comparison
👉 Stops at first mismatch
but default behavior of equals() is same as "==" because it compares memory references, not content.
However, String class overrides equals() to compare content of the strings


| Feature     | String   | StringBuilder | StringBuffer |
| ----------- | -------- | ------------- | ------------ |
| Mutable     | ❌ No     | ✅ Yes         | ✅ Yes     |
| Thread Safe | ✅ Yes    | ❌ No          | ✅ Yes     |
| Fast        | ❌ Slower | ✅ Fast        | ⚠ Medium   |

Why StringBuilder is faster than StringBuffer? Because StringBuilder does NOT use synchronized methods.

Use:

String → Normal usage

StringBuilder → Heavy modification

StringBuffer → Multithreaded modification

 */

public class StringsRelated {
    public static void main(String[] args) {
        String var0 = "Happy"; //new obj is created in string pool
      //  var0 = "Birthday"; //new obj is created in string pool, previous "Happy" obj is now eligible for garbage collection
        String var1 = "Happy"; //no new obj is created, reference is pointing to existing "Happy" obj in string pool
        System.out.println(var0);

        // "==" compares the references of the objects
        System.out.println("var0 == var1 " + (var0 == var1)); // condition is true because no duplicates in string pool both references point to same object in string pool

        String var2 = new String("Happy"); //new obj is created in heap memory
        String var3 = new String("Happy"); //new obj is created in heap memory
        System.out.println("var2 == var3 " +(var2 == var3)); // condition is false because both references point to different objects in heap memory

        int num1 = 29;
        int num2 = 29;
        if(num1 == num2); // condition is true because both are primitive types and values

        String var4 = new String("Javas");
        String var5 = new String("Javas");
        //.equals() belongs to objects and not for primitive types
        if(var4.equals(var5)); // condition is true because both objects have same content and equals() method compares content of the objects
        Objects.equals(var4, var5); // this is another way to compare content of the objects

        //the literal "Hello" must still be stored in the pool because all literals are pooled automatically.
        // The new keyword simply creates an additional heap object.
        String obj1 = new String("HelloWorld"); //obj1 points to the heap object, not the pool.
        String obj2 = new String("Hello");
        obj2+= "World"; //  obj2 is mutable as it calls StringBuilder behind the scenes and "Hello" in heap is modified to "HelloWorld" and obj2 points to it, but original "Hello" in pool is still there until garbage collected.
        obj2 = new StringBuilder(obj2)  //internally
                .append("World")
                .toString();
        System.out.println(obj1.equals(obj2)); // true because both obj and obj2 have same content "HelloWorld"
        System.out.println(obj1 == obj2); // false because obj1 and obj2 are different objects in memory

        int num3 = 21;
        int num4 = 21;
       // if(num3.equals(num4)); incorrect because primitive types do not have methods

        Integer num5 = 21;
        Integer num6 = 21;
        if(num5.equals(num6)); // correct because Integer is a wrapper class


        String s1 = new String("Hello");
        s1.concat("World"); // s1 is immutable, so it will not change the original string, it will create a new string "HelloWorld" and s1 will still point to "Hello"
        // s1=s1+"world"; // this will create a new string "HelloWorld" and s1 will point to it, but original string "Hello" will still be in memory until garbage collected
        System.out.println(s1); // it will print "Hello" because s1 is still pointing to the original string "Hello" and not the new string "HelloWorld"

        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World"); // it will modify the same object in heap memory and append "World" to it, so sb will now point to "HelloWorld" in heap memory, no new object creation
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("Good");
        sb1.append("Morning"); //similar to StringBuffer.
        System.out.println(sb1);
    }
}
