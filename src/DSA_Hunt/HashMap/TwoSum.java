package DSA_Hunt.HashMap;

import java.util.HashMap;
import java.util.Map;

/*
“HashMap Approach” (Most important)
👉 Uses HashMap
👉 Returns indices of the two numbers that add up to the target
👉 Time Complexity: O(n) for single pass, O(1) for HashMap operations → Overall O(n)
👉 Space Complexity: O(n) for HashMap in worst case (if all elements are unique)
 */
public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 4};
        int target = 6;

        int[] result = twoSum(arr, target);
        if (result != null) {
            System.out.println("Two Sum Indices: " + result[0] + ", " + result[1]); // Output: Two Sum Indices: 1, 2 (because 5 + 1 = 6)
        } else {
            System.out.println("No two sum pair found.");
        }
    }

}
