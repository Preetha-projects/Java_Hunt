package DSA_Hunt.HashMap;

import java.util.*;

/*
Problem: Find All Duplicates in an Array

Given an integer array nums of size n where:
    Each element is in the range [1, n]
    Some elements appear twice, others appear once

    👉 Return all the elements that appear twice

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
 */

public class FindDuplicatesInArray {

    public static List<Integer> allDuplicates(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Step 1: Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Collect duplicates
        for (int num : map.keySet()) {
            if (map.get(num) > 1) {
                result.add(num);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};   //Output: [2,3]

        List<Integer> duplicates = allDuplicates(arr);

        System.out.println("Duplicates: " + duplicates);
    }
}
