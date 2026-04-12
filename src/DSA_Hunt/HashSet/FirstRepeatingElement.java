package DSA_Hunt.HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
First repeating means smallest index of first occurrence, not first duplicate you encounter
Problem:
Given an array, find the first element that repeats (i.e., whose first occurrence index is smallest).
Example:
[10, 5, 3, 4, 3, 5, 6] → Output: 5
(because 5 repeats and its first occurrence comes before 3)

Using HashSet: Time: O(n), Space: O(n)
Using HashMap: Time Complexity: O(n), Space Complexity: O(n)

 */

public class FirstRepeatingElement {

    //HashSet Approach: Traverse from right to left, add elements to set. If element already in set, update minIndex. Finally return element at minIndex.
    public static int smallestIndexOfRepeatingEle(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int n = arr.length;
        int minIndex = -1;

        for (int i = n - 1; i >= 0; i--) {
            if (set.contains(arr[i])) {
                minIndex = i;
            } else {
                set.add(arr[i]);
            }
        }
        System.out.println(set);

        if (minIndex == -1) {
            return -1;
        }

        return arr[minIndex];
    }

    //Approach (HashMap – Frequency Count) HashMap stores frequencies, then we check for the first element with frequency > 1 in the original order of the array.
    public static int smallIndex(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        int len = arr.length;

        for(int num:arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        System.out.println(map);

        for(int num:arr){
            if(map.get(num)>1){
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        System.out.println(smallestIndexOfRepeatingEle(arr));
        System.out.println(smallIndex(arr));
    }
}
