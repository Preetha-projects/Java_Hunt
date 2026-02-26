package DSA_Hunt.Arrays.TwoPointer;

/*
Problem: Remove Element (In-Place)

Given an integer array nums and an integer val, remove all occurrences of val in-place.

Objective:

    Modify the input array such that:

    All elements not equal to val appear in the beginning of the array.

    The relative order of elements does not matter.

    The operation must be done in-place (do not use extra arrays).

    Return the number of elements remaining after removal.
 */

public class RemoveElement {
    public static int removeTargetElement(int[] arr, int target) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;  //output: 5
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println("The number of elements remaining after removal: " + removeTargetElement(nums, val));
    }
}
