package CoreJava.Collection.List;

/*

ArrayList is a resizable array implementation of the List interface in Java. Internally, it uses an array to store the elements.

| Default capacity | 10                              |
| Resize formula   | oldCapacity + (oldCapacity / 2) |
| Access time      | O(1)                            |
| Insertion middle | O(n)                            |
| Deletion middle  | O(n)                            |

when array is full, Create new bigger array, Copy old elements, Add new element
     newCapacity = oldCapacity + (oldCapacity/2)

 */

import java.util.List;

public class ArrayList {

    // List<String> list = new List<String>() ❌ - List is an interface,we cannot create an instance of it directly.
    // We need to use a class that implements the List interface, such as ArrayList or LinkedList.

    //ArrayList<String> list = new ArrayList<>(); Bad practice

        public static void main(String[] args) {
            //Programming to the Interface (Good Practice) flexibility, abstraction, and allows changing implementations (like ArrayList or LinkedList) without modifying the rest of the code.
            List<String> list = new java.util.ArrayList<>(); // ✅ - Using ArrayList which implements List interface
            list.add("Hello");
            list.add("World");
            list.add("Hello"); // Allows duplicates
            list.add(null);    // Allows null elements
            System.out.println(list); // Output: [Hello, World, Hello, null]
            //ArrayList prints elements directly because it overrides toString(),
            //while arrays use the default toString() from Object which prints class name and hashcode.

            System.out.println(list.get(2)); // Accessing element at index 2 (returns "Hello")
            list.remove("World"); // Removing an element
            System.out.println(list); // Output: [Hello, Hello, null]
            list.remove(2); // Removing element at index 2 (removes null)
            System.out.println(list); // Output: [Hello, Hello]

            System.out.println(list.size()); // Returns the number of elements in the list
            list.add(1, "Java"); // Adding element at specific index
            System.out.println(list); // Output: [Hello, Java, Hello]

        }
}
