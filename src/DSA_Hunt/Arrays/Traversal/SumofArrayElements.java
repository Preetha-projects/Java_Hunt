package DSA_Hunt.Arrays.Traversal;

/*
Space complexity is about how memory grows with input size, NOT how many fixed variables exist.
We traverse the array once, so time complexity is O(n).
Fixed no. of variables, so space complexity is O(1)."
 */

public class SumofArrayElements {
    public int sumOfElements(int[] arr) {

        if (arr==null || arr.length == 0){
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int sum = 0;
        for (int i : arr) {
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] elements = {20,30,40,10,80};
        SumofArrayElements obj = new SumofArrayElements();
        System.out.println("Sum of elements: " + obj.sumOfElements(elements));
    }
}
