package CoreJava.Collection.Queue;

import java.util.Queue;
import java.util.Stack;

/*
Approach 1 (Costly Enqueue):
-------------------------------------
Always keep new element at bottom
So dequeue becomes easy
        | Operation | Time |
        | --------- | ---- |
        | Enqueue   | O(n) |
        | Dequeue   | O(1) |


Approach 2 (Better – Costly Dequeue):
-------------------------------------
Queue can be implemented using two stacks by reversing element order to simulate FIFO behavior.
        | Operation | Time           |
        | --------- | -------------- |
        | Enqueue   | O(1)           |
        | Dequeue   | Amortized O(1) |

Enqueue 10, 20, 30 to s1:
s1: [10, 20, 30]  (top = 30)
s2: []

Dequeue
Move to s2: pop and push to s2 until s1 is empty
s1: []
s2: [30, 20, 10] (top = 10) pop from s2 → 10

Pop:
Output: 10 ✅
 */

public class QueueUsingStack {  //Approach 2 (Better – Costly Dequeue)

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue ( int element){
        stack1.push(element);
    }

    public int dequeue () {
        if (stack1.isEmpty() && stack2.isEmpty()) {
           System.out.println("Queue is empty");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        // stack2.peek()
        return stack2.pop();  // peek() -> same as pop but without removing the element from stack2
    }

    public void display() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        // Print s2 (top to bottom)
        for (int i = stack2.size() - 1; i >= 0; i--) {
            System.out.print("s2: " + stack2.get(i) + " ");
        }

        // Print s1 (bottom to top)
        for (int i = 0; i < stack1.size(); i++) {
            System.out.print("s1: " + stack1.get(i) + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display(); //2 3

        System.out.println(queue.dequeue());
        queue.enqueue(4);
        queue.display(); //3 4

        System.out.println(queue.dequeue());
        queue.display();
    }
}