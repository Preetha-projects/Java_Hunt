package CoreJava.Collection.Queue;

/*
[ _   _   _   _   _ ]
  ↑
front = 0
rear = -1

Basic Idea of linear Queue:
    Enqueue → Insert at rear
    Dequeue → Remove from front
    Use an array + two pointers:
        front
        rear

Time Complexity
    Enqueue: O(1)
    Dequeue: O(1)
    Peek: O(1)
    isEmpty: O(1)
    isFull: O(1)

Space Complexity
    O(n) for the array

In array-based queues, elements are not physically removed to maintain O(1) complexity;
instead, the front pointer is advanced, making the removal logical

| Implementation    | Removal Type       |
| ----------------- | ------------------ |
| Array Queue       | Logical removal ❌  |
| Circular Queue    | Logical removal ❌  |
| Linked List Queue | Physical removal ✅ |

 */
public class ImplementQueueUsingArray {
    private int[] arr;
    private int front;  //exit
    private int rear;   //entry
    private int capacity;

    public ImplementQueueUsingArray(int capacity) {
        this.arr=new int[capacity];
        this.capacity=capacity;
        front=0;
        rear=-1;
    }

    public void enqueue(int value) {
        if(rear==capacity-1){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        arr[rear]=value;
    }

    public int deque() {
        if(front>rear){
            System.out.println("Queue is empty");
            return -1;
        }
        int value=arr[front];
        front++;
        return value;
    }

    public int peek() {
        if(front>rear){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public void display() {
        if(front>rear){
            System.out.println("Queue is empty");
            return;
        }

        for(int i=front; i<=rear; i++){
            System.out.println((arr[i]+ " "));
        }
    }

    public boolean isEmpty() {
        return front>rear;
    }

    public boolean isFull() {
        return rear==capacity-1;
    }

    public static void main(String[] args) {
        ImplementQueueUsingArray queue = new ImplementQueueUsingArray(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display(); // Output: 10 20 30 40 50
        System.out.println("Front element: " + queue.peek()); // Output: 10

        queue.deque();
        System.out.println("Front element after dequeue: " + queue.peek()); // Output: 20

        System.out.println("Is Queue Empty? " + queue.isEmpty()); // Output: false
        System.out.println("Is Queue Full? " + queue.isFull()); // Output: true
        queue.enqueue(60); // Output: Queue is full
        queue.display();  // we have space in the array, but we are not using effectively so go circular queue to solve this problem
    }
}
