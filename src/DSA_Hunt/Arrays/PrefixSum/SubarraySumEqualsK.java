package DSA_Hunt.Arrays.PrefixSum;

/*

Given:
    nums[]
    integer k
Return:
    Count of continuous subarrays whose sum = k
 */

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Before starting, sum = 0 exists

        int currSum = 0;
        int count = 0;

        for (int num : nums) {
            currSum += num;
            System.out.println("num "+num);
            System.out.println("currSum "+currSum);
            if (map.containsKey(currSum - k)) {   // prefix[j] = prefix[i] - k  => prefix[i] = prefix[j] + k
                count += map.get(currSum - k); // We add the count of such prefix sums to our result.
                System.out.println("count "+ count);
            }

            map.put(currSum, map.getOrDefault(currSum, 0) + 1); // frequency of prefix sum in the map
            System.out.println("Prefix Sum Map: " + map);
        }
        return count;
    }

    public static void main(String[] args) {
        SubarraySumEqualsK obj = new SubarraySumEqualsK();
        int[] nums = {3, 4, 7, 2, -3, 1, 4, 2};
        int k = 7;
        System.out.println("Count of subarrays with sum " + k + ": " + obj.subarraySum(nums, k));  // Output: 4
        //[3,4] ✅
        //[7] ✅
        //[7,2,-3,1] ✅
        //[1,4,2] ✅
    }
}
