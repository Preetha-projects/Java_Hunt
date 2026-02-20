package DSA_Hunt.TwoPointer;

//Time complexity : O(n) where n is the number of elements in the array. This is because in the worst case, we may have to traverse the entire array once to find the pair that sums to the target.
//Space complexity : O(1) because we are using only a constant amount of extra space to store the two pointers and the result.

// Sorted array : Use Two Pointers → O(n), O(1)

// Unsorted array : Use HashMap → O(n), O(n)

public class TwoSumSortedArray {

    public int[] findPair(int[] arr, int target) {
        int n = 0;
        int m = arr.length - 1;

        while (n < m) {
            int sum = arr[n] + arr[m];
            if (sum == target) {
                return new int[]{arr[n], arr[m]};
            } else if (sum > target) {
                m--;
            } else {
                n++;
            }
        }
        return null; // Return null if no pair is found that sums to the target.
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 10;

        TwoSumSortedArray obj = new TwoSumSortedArray();
        int[] pair = obj.findPair(arr, target);
        if (pair != null) {
            System.out.println("Pair found: " + pair[0] + ", " + pair[1]);
        } else {
            System.out.println("No pair found that sums to " + target);
        }
    }
}
