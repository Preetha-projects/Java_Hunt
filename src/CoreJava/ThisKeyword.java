package CoreJava;

public class ThisKeyword {

    static String outerVariable="Rhea"; // Static variable (stored in HEAP)
    public static void main(String[] args)
    {
        StudentWithThis s = new StudentWithThis();
        //s.name= outerVariable; // Accessing static variable directly
        System.out.println("s.name = " + s.name ); // Output: s.name = Rhea

        StudentWithoutThis s2 = new StudentWithoutThis("Rhea");
        System.out.println("s2.name= " + s2.name); // Output: null
    };
}

    class StudentWithThis {
        String name;   // Instance variable (stored in HEAP)

        // this in Constructor (Resolving Variable Conflict)
        StudentWithThis(String name) {  // Parameter (stored in STACK)
            this.name = name;  // Assigns value to heap variable
        }

        StudentWithThis() {
            this("Payal");    // Calls the parameterized constructor with "Payal"
            //constructor sets initial value s.name= Payal, then we can reassign it to Rhea in main method.
        }
    }
    /*
    ----------------------------------------
    CASE 1: Using `this`

    STACK:                          HEAP:
    ------                          ------
    name = "Rhea"         →         name = "Rhea" ✅

    Explanation:
            this.name = name;
    Heap object's variable gets value from stack parameter.
    ----------------------------------------
    */

     class StudentWithoutThis {

        String name;   // Instance variable (stored in HEAP)

        StudentWithoutThis(String name) {
            String him = name;
            // Local variable (STACK)
            // Destroyed after constructor execution
        }
    }
    /* ---------------------------------
    CASE 2: Without `this`

    STACK:                          HEAP:
    ------                          ------
    name = "Rhea"                   name = null ❌
    him  = "Rhea"

    After constructor ends:
            - name (parameter) destroyed
            - him destroyed
            - object remains with name = null
     ---------------------------------
     */

