package DSA_Hunt.Arrays.SlidingWindow;
/*
Two loops, outer loop to scan through array and inner loop to calculate sum of current window.

Time Complexity: O(nk)
Space Complexity: O(1)
 */

public class MaxSumSubarrayBruteForce {
    public static int maxSumSubarray(int[] arr, int k){
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;   // don't assign to 0 it will fail if elements are negative.
        for(int outer=0; outer<=n-k; outer++){
            int currentSum=0;
            for(int inner=outer; inner<outer+k; inner++){
                currentSum+=arr[inner];
            }
            maxSum = Math.max(currentSum,maxSum);
        }
        return maxSum;
    }


    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println(maxSumSubarray(arr, k));
    }
}
