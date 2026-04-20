package DSA_Hunt.HashSet;

import java.util.HashSet;
import java.util.Set;

/*
“Set Approach” (No indices)
    👉 Uses HashSet, not HashMap
    👉 Only tells if a pair exists, not their indices
    👉 Time Complexity : O(n) for single pass, O(n) for HashSet operations → Overall O(n)
    👉 Space Complexity: O(n) for HashSet in worst case (if all elements are unique)
 */
public class TwoSum {

    public static boolean twoSum(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();

        for (int num:arr){
            if (set.contains(target-num)) {
                return true;   // pair found that sums to target
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 4};
        int target = 6;

        System.out.println("Two Sum Result: " + twoSum(arr, target)); // Output: true (because 5 + 1 = 6)
    }
}

