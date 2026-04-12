package CoreJava.Collection.List;

/*
Implement own ArrayList or Design a dynamic array

Step 1: Basic Structure
Step 2: Add Element
Step 3: Resize
Step 4: Get Element
Step 5: Remove Element
Step 6: Insert Method
Step 7: Size Method

| Operation | Complexity     |
| --------- | -------------- |
| add()     | O(1) amortized |  - When adding an element, if the array is full, we resize it. The resizing operation takes O(n) time, but since it happens infrequently (when the array is full), the average time taken per add operation over a sequence of adds is O(1).
| get()     | O(1)           |
| remove()  | O(n)           |
| insert()  | O(n)           |

*/

class MyArrayList {
    private int[] arr;
    private int capacity;
    private int size;

    public MyArrayList() {
        capacity = 10;  //We can initialize at declaration, but constructors allow dynamic initialization and better flexibility
        arr = new int[capacity];
        size = 0;
    }

    public void add(int ele) {
        if (size == capacity) {
            resize();
        }
        arr[size++] = ele;
    }

    private void resize() {
        capacity = capacity + (capacity / 2);
        int[] newArr = new int[capacity];  // 1. Create new array with increased capacity

        for (int i = 0; i < size; i++) {  // 2. Copy old elements to new array
            newArr[i] = arr[i];
        }

        arr = newArr;  // 3. Point to the new array
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = index; i < size - 1; i++) {  // Shift elements to the left to fill the gap
            arr[i] = arr[i + 1];
        }

        size--; // important to decrease size after shifting, otherwise the last element will be duplicated and size will be incorrect
    }

    public void insert(int index, int element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (size == capacity) {
            resize();
        }

        for (int i = size - 1; i >= index; i--) {  // Shift elements to the right to create space for the new element
            arr[i + 1] = arr[i];
        }

        arr[index] = element;
        size++;  // Increase size after insertion
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        MyArrayList myImpl = new MyArrayList();
        myImpl.add(10);
        myImpl.add(22);
        myImpl.add(31);
        System.out.println("Size: " + myImpl.size()); // Size: 3
        System.out.println("Element at index 1: " + myImpl.get(1)); // Element at index 1: 22
        myImpl.insert(1, 12);
        System.out.println("Element at index 1 after insertion: " + myImpl.get(1)); // Element at index 1 after insertion: 12
        myImpl.remove(2);
        System.out.println("Size after removal: " + myImpl.size()); // Size after removal: 3
    }
}
