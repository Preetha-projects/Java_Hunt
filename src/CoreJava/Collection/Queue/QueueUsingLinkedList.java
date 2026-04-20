package CoreJava.Collection.Queue;

/*
Queue using linked list allows O(1) insertion and deletion without size limitation using front and rear pointers.
Uses a Node (data + next)
A node = data + reference to next node  [ data | next address ]

| Variable | Points to  | Meaning               |
| -------- | ---------- | --------------------- |
| `front`  | first node | where dequeue happens |
| `rear`   | last node  | where enqueue happens |

front and rear is a reference variable that stores the address of the  node, not the value itself
rear.next is ALWAYS null ✅ (because it’s the last node)
front.next is null ONLY when there is one element ❌ otherwise it points to next node

| Operation | Time |
| --------- | ---- |
| Enqueue   | O(1) |
| Dequeue   | O(1) |

Advantages
Dynamic size (no overflow like arrays)
Efficient insertion & deletion

Disadvantages
Extra memory for pointers
Slightly complex compared to array implementation
 */

class Node {
int data;
Node next;

Node(int value) {
    data = value;
    next = null;
}
}

public class QueueUsingLinkedList {
    Node front;
    Node rear;

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (front == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int value = front.data;
        front = front.next;
        return value;
    }

    public int peek() {
        return front.data;
    }

    public boolean isEmpty() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return true;
        }
        return false;
    }

    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front holds the address of first node:" + queue.front); // holds the address of first node
        System.out.println("Front data holds the value of the first node: " + queue.front.data); //holds the value of the first node (10)
        System.out.println("Front next holds the address of the next node: " + queue.front.next); // holds the address of the next node (20)

        System.out.println("Rear holds the address of last node: " + queue.rear); // holds the address of last node
        System.out.println("Rear data holds the value of the last node: " + queue.rear.data); // holds the value of the last node (30)
        System.out.println("Rear next holds null because rear is the last node: " + queue.rear.next);  // holds null because rear is the last node

        queue.display(); // 10 20 30

        System.out.println(queue.dequeue()); // 10

        System.out.println(queue.peek()); // 20
        System.out.println(queue.isEmpty()); // false

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.isEmpty()); // true
    }
}
