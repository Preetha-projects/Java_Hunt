package DSA_Hunt.Arrays.SlidingWindow;
/*
Problem Statement

Given:
    An array of positive integers nums
    An integer k

Return:
    The total number of contiguous subarrays
    where the product of all elements in the subarray is strictly less than k.

Time Complexity: O(n) - Each element is visited at most twice (once when added to the product and once when removed).
Space Complexity: O(1)

Counting problems → add (right - left + 1)
 */
public class SubArrayLessThanGivenProduct {

    public static int numSubArrayProductLessThanK(int[] arr, int target) {
        int left = 0;
        int product=1;
        int count=0;

        for(int right=0; right<arr.length; right++){
            product*=arr[right];
            while(product>=target){
                product=product/arr[left];
                left++;
            }
            count+=right-left+1;  //All subarrays ending at right and starting from left to right are valid
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 6};
        int target = 100;
        System.out.println("Total number of contiguous subarrays with product less than " + target + ": " + numSubArrayProductLessThanK(arr, target));
    }
}
