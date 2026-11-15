package DSA_Hunt.Arrays.Algorithms.Kadanes;

public class MaximumSumCircularArr {
    public static int maxSubarraySumCircular(int[] nums) {
        //Maximum circular sum = totalSum−minSubarraySum
        int maxSum=nums[0], minSum=nums[0];
        int currMaxSum=nums[0], currMinSum=nums[0];
        int totalSum=nums[0];  //inside the loop we only add from index 1.

        for(int i=1;i<nums.length;i++)
        {
            //find max
            currMaxSum=Math.max(nums[i],currMaxSum+nums[i]);
            maxSum=Math.max(currMaxSum,maxSum);

            //find min
            currMinSum=Math.min(nums[i],currMinSum+nums[i]);
            minSum=Math.min(currMinSum,minSum);

            totalSum+=nums[i];
        }
        if(maxSum<0) return maxSum;
        return Math.max(maxSum, totalSum-minSum);
    }

    public static void main (String args[]){
        int[] nums = {5,-3,5};
        System.out.println(maxSubarraySumCircular(nums));  //10
    }
}
