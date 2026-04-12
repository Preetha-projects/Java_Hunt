package DSA_Hunt.Arrays.PrefixSum;

import java.util.Arrays;

/*
Problem Statement:
    Given an array of integers nums, return an array runningSum such that:
    runningSum[i] is equal to the sum of nums[0] + nums[1] + ... + nums[i].
    i.e, runningSum[i] is the sum of all elements from index 0 to i (inclusive).
 */

public class    RunningSumArray {

    public static void main(String[] args){
        int[] nums = {2,3,4,5};
        System.out.println("Array: "+ Arrays.toString(nums));
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];

        for(int i=1; i<nums.length;i++){
            runningSum[i] = runningSum[i-1] + nums[i];
        }

        for(int i=1; i<nums.length;i++){
            nums[i] += nums[i-1];
        }
        System.out.println("Running Sum Array(In place): "+ Arrays.toString(nums));
        System.out.println("Running Sum Array: "+ Arrays.toString(runningSum));
    }
}
