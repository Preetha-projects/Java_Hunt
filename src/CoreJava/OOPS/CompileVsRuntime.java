package CoreJava.OOPS;

/* ---- Fields (variables) are bound at compile time using reference type.
       Non-static fields are not polymorphic.
       Static fields are class-level and also bound at compile time.
 Non-static methods are polymorphic → resolved at runtime based on object type.
 Static methods are bound at compile time → resolved using reference type, even if the object is of subclass.
 Static variables/methods belong to the class, not the object.

 Reference type vs object type matters:
       Reference type → decides fields/Instance or non-static variables and static members at compile time
       Object type    → decides instance method, constructors execution at runtime
       Instance methods support overriding. Overridden methods are resolved at runtime based on the actual object type, not the reference type.

       Instance variables are created at runtime inside the object, but they are accessed based on the reference type at compile time.
       Unlike methods, variables do not support runtime polymorphism in Java.

| Reference type | Object type | Can call method in Parent? | Can call method in Child? |
| -------------- | ----------- | -------------------------- | ------------------------- |
| Parent         | Parent      | ✅ Yes                     | ❌ No                     |
| Parent         | Child       | ✅ Yes                     | ❌ No                     |
| Child          | Child       | ✅ Yes                     | ✅ Yes                    |
| Child          | Parent?     | ❌ Impossible              | ❌ N/A                    |

- Reference type decides what methods/fields you can access at compile time
- Object type decides which overridden method actually runs at runtime

| Compile Time               | Runtime                       |
| -------------------------- | ----------------------------- |
| Code checking              | Code execution                |
| Done by compiler           | Done by JVM                   |
| Detects syntax/type errors | Allocates memory & runs logic |

 */

public class CompileVsRuntime {

    // Instance variable
    int instanceVar = 10; //

    // Static variable (class-level)
    static int staticVar = 100;

    // Non-static method
    void instanceMethod() {
        System.out.println("A instanceMethod, instanceVar=" + instanceVar + ", staticVar=" + staticVar);
    }

    // Static method
    static void staticMethod() {
        System.out.println("A staticMethod, staticVar=" + staticVar);
    }

}

class SubClass extends CompileVsRuntime {

    // Instance variable hides A's
    int instanceVar = 20;

    // Static variable hides A's
    static int staticVar = 200;

    // Non-static method overrides A's
    @Override
    void instanceMethod() {
        System.out.println("B instanceMethod, instanceVar=" + instanceVar + ", staticVar=" + staticVar);
    }

    // Static method hides A's
    static void staticMethod() {
        System.out.println("B staticMethod, staticVar=" + staticVar);
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println("=== Reference type: A, Object type: A ===");
        CompileVsRuntime obj1 = new CompileVsRuntime();
        System.out.println("obj1.instanceVar = " + obj1.instanceVar); // 10 (compile-time reference type)
        System.out.println("obj1.staticVar = " + obj1.staticVar);     // 100 (static based on reference type)
        obj1.instanceMethod(); // A.instanceMethod() → runtime based on object type (A)
        obj1.staticMethod();   // A.staticMethod() → compile-time based on reference type

        System.out.println("\n=== Reference type: A, Object type: B ===");
        CompileVsRuntime obj2 = new SubClass();
        System.out.println("obj2.instanceVar = " + obj2.instanceVar); // 10 (compile-time reference type)
        System.out.println("obj2.staticVar = " + obj2.staticVar);     // 100 (static based on reference type)
        obj2.instanceMethod(); // B.instanceMethod() → runtime based on object type (B)
        obj2.staticMethod();   // A.staticMethod() → compile-time based on reference type

        System.out.println("\n=== Reference type: B, Object type: B ===");
        SubClass obj3 = new SubClass();
        System.out.println("obj3.instanceVar = " + obj3.instanceVar); // 20 (reference type B)
        System.out.println("obj3.staticVar = " + obj3.staticVar);     // 200 (static based on reference type)
        obj3.instanceMethod(); // B.instanceMethod() → runtime (object type B)
        obj3.staticMethod();   // B.staticMethod() → compile-time (reference type B)
    }
}
