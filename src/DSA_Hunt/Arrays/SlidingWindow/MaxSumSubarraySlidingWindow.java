package DSA_Hunt.Arrays.SlidingWindow;
/*
Reuse the previous window’s sum.
When sliding the window, subtract the outgoing element and add the incoming element.
This reduces time complexity from O(nk) to O(n).]

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class MaxSumSubarraySlidingWindow {
    public static int maxSumSubarray(int[] arr, int k) {
        int n = arr.length;
        // Step 1: Compute first window sum
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        int maxSum = windowSum;
        // Step 2: Slide the window
        for (int j = k; j < n; j++) {
            windowSum = windowSum - arr[j - k] + arr[j];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
        public static void main(String[] args) {
            int[] arr = {2, 1, 5, 1, 3, 2};
            int k = 3;
            System.out.println(maxSumSubarray(arr, k));
        }
}
