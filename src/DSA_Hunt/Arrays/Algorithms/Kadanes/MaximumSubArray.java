package DSA_Hunt.Arrays.Algorithms.Kadanes;

public class MaximumSubArray {
    public static int maxSubArray(int[] nums) {
        int currSum=nums[0];
        int maxSum=nums[0];

        for(int i=1;i<nums.length;i++){
            currSum=Math.max(nums[i],currSum+nums[i]);
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
    public static void main(String args[]) {
        int[] nums = {-1, 1, 3, -2,};
        System.out.println(maxSubArray(nums));  //output 4
    }
}
