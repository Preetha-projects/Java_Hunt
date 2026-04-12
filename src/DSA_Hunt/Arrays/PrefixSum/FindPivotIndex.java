package DSA_Hunt.Arrays.PrefixSum;

/*

Problem Statement:
Given an integer array nums, find the pivot index.
The pivot index is the index where the sum of all elements strictly to
the left of the index is equal to the sum of all elements strictly to the right of the index.
If no such index exists → return -1

Complexity
Time: O(n) (single pass)
Space: O(1) (no extra memory)


At any index i:
- Left sum = leftSum
- Right sum = totalSum - leftSum - nums[i]
 */

public class FindPivotIndex {

    public int indexValue(int[] arr) {
        int leftSum = 0;
        int totalSum = 0;

        for (int num : arr) {
            totalSum += num;
        }

        for (int i = 0; i < arr.length; i++) {
            if (leftSum == totalSum - leftSum - arr[i]) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        int[] arr = {1, 7, 3, 6, 5, 6};
        System.out.println("Pivot Index: " + findPivotIndex.indexValue(arr)); // Output: 3
    }
}
