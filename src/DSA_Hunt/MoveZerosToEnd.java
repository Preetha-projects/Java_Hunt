package DSA_Hunt;

//Time Complexity is O(n) because the array is traversed at most twice.
import java.util.Arrays;

/*
Algorithm:
----------
1. Input :  Take array arr
2. Initialize
   Set index = 0  (This will track position for next non-zero element)
3. Traverse Array
For each element in array:
    If element is not zero:
        Place element at arr[index]
        Increment index
4. Fill Remaining Positions
    From index to end of array:
    Assign 0
 */

public class MoveZerosToEnd {

    public void moveZeros(int[] arr) {
        //Two pointer technique: one pointer (index) to track the position of the next non-zero element, and another pointer (i) to traverse the array.
        int index = 0; // slow pointer for the position of the next non-zero element

        // Move non-zero elements forward
        for (int i : arr) {
            if (i != 0) {
                arr[index] = i;
                index++;
            }
        }

        // Fill remaining positions with zeros
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 4, 0, 5};

        int index = 0;
        int[] newArr = new int[arr.length];

        // Move non-zero elements forward
        for (int i:arr) {
            if (i != 0) {
                newArr[index] = i;
                index++;
            }
        }

        // Fill remaining positions with zeros
        while (index < arr.length) {
            newArr[index] = 0;
            index++;
        }
        //Even though there are two loops, complexity remains O(n) because constants are ignored in Big-O notation.
        System.out.println("Without Modifying original array: " + Arrays.toString(newArr));

        MoveZerosToEnd obj = new MoveZerosToEnd();
        obj.moveZeros(arr);
        //Space complexity is O(n)
        System.out.println("Modified original array: " + Arrays.toString(arr));
    }
}

