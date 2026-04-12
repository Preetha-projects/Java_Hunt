package DSA_Hunt.Arrays.PrefixSum;

/*

Problem: Range Sum Query – Immutable
    Given an integer array nums, handle multiple queries of the following type: sumRange(left, right)=nums[left]+nums[left+1]+⋯+nums[right]
    Implement a class that:
        Precomputes the array
        Answers each query in O(1) time

Note:
We use the constructor to precompute prefix sum once during initialization so that all queries can be answered in O(1) and the object is always ready to use
 */

public class RangeSumQuery {

    private final int[] prefixSum;

    public RangeSumQuery(int[] nums) {
        prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
    }

    public int sumQuery(int left, int right) {
        return prefixSum[right] - (left > 0 ? prefixSum[left - 1] : 0);
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5};
        RangeSumQuery rangeSumQuery = new RangeSumQuery(nums);  // Precompute prefix sum during initialization
        System.out.println("Sum of range (0, 2): " + rangeSumQuery.sumQuery(0, 2)); // Output: 6
        System.out.println("Sum of range (1, 3): " + rangeSumQuery.sumQuery(1, 3)); // Output: 9
        System.out.println("Sum of range (-1, 4): " + rangeSumQuery.sumQuery(-1, 4)); // Output: 15
    }
}
