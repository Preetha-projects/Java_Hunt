package DSA_Hunt.Arrays.SlidingWindow;
/*

Problem Statement:

Given:
    An array of positive integers nums
    An integer K

Return:
    The length of the longest contiguous subarray
    whose sum is less than or equal to K.

For longest problems:
    -Expand first
    -Shrink only when invalid
    -Update
 */
public class LongestSubarrayWithSum {

    public static int longestSubArray(int[] arr, int target) {
        int left = 0;
        int sum = 0;
        int maxLength=0;

        for(int right=0; right<arr.length; right++){
            sum+=arr[right];   //Expand window
            while(sum>target){
                sum -= arr[left];
                left++;
            }
            //Update max length when valid
            maxLength  = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 5, 2, 3, 4, 1};
        int target = 10;
        System.out.println("Longest Subarray with Sum: " + longestSubArray(arr, target));
    }
}
