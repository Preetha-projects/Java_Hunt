package CoreJava.Collection.List;

import java.util.List;
import java.util.LinkedList;

/*
LinkedList is a List implementation that stores elements in nodes connected by references.
Unlike ArrayList, it does not use an array internally.
Instead, it uses a doubly linked list. Each node knows: previous node, next node

| Default capacity   | No capacity (nodes are created dynamically)            |
| Internal structure | Doubly linked list (nodes with prev + next references) |
| Access time        | O(n)                                                   |
| Insertion middle   | O(1) *(if node reference is known)*                    |
| Deletion middle    | O(1) *(if node reference is known)*                    |

Each element is stored in a node -> [previous address | data | next address]
Fast insertion and deletion - Just change pointers: No shifting required.
Slow random access - Need to traverse the list to find the element (ie node by node)

| Method     | Purpose            |
| ---------- | ------------------ |
| add()      | add element        |
| addFirst() | add at beginning   |
| addLast()  | add at end         |
| remove()   | remove element     |
| get()      | access element     |
| size()     | number of elements |

 */
public class LinkedListBasic {

   public static void main(String[] args) {
       List<String> linkedList = new LinkedList<>();
       linkedList.add("Preetha");
       linkedList.add("Yazh");
       linkedList.add("Preetha"); // Allows duplicates

       System.out.println(linkedList); // Output: [Preetha, Yazh, Preetha]

       linkedList.add(1, "Java"); // Adding element at specific index
       System.out.println(linkedList); // Output: [Preetha, Java, Yazh, Preetha]

       linkedList.remove("Yazh"); // Removing an element
       System.out.println(linkedList); // Output: [Preetha, Java, Preetha]
       linkedList.remove(2); // Removing element at index 2 (removes second "Preetha")
       System.out.println(linkedList); // Output: [Preetha, Java]

   }

}
