package DSA_Hunt.Arrays.SlidingWindow;
/*
Problem: Minimum Size Subarray with Sum
Given an array of positive integers and a positive integer target, find the minimal length of a contiguous
subarray of which the sum is greater than or equal to target. If there is no such subarray, return 0 instead.

Logic:
Expand window → add arr[right]
Check if sum ≥ target
If yes → shrink and update min length

Time Complexity: O(n) - Each element is visited at most twice (once when added to the sum and once when removed).
Space Complexity: O(1)

For minimum subarray problems:
    -Expand first
    -When valid → shrink and update
 */
public class MinSizeSubArray {
    public static int minSubArrayLen(int[] arr, int target) {
        int left = 0;
        int sum = 0;
        int minLength=Integer.MAX_VALUE;

        for (int right =0; right < arr.length; right++){
            sum+=arr[right];   //Expand window
            while(sum>=target) {  //shrink while valid
                minLength=Math.min(minLength,right-left+1);
                sum = sum - arr[left];
                left++;
            }
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,2,2,4,3};
        int target = 7;
        System.out.println("Minimum Size Subarray with Sum: " + minSubArrayLen(arr, target));
    }
}
