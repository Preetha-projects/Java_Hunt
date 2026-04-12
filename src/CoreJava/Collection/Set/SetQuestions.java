package CoreJava.Collection.Set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetQuestions {

    //1. Remove Duplicates from Array using Set

        public static void removeDuplicates(int[] arr) {
            Set<Integer> newSet= new HashSet<>();

            for(int i:arr) {
                newSet.add(i);
            }
            System.out.println(newSet);
        }

    //2.Check if Array Contains Duplicates
        public static boolean checkDuplicates(int[] arr) {

            Set<Integer> newSet = new HashSet<>();

            for (int num:arr) {
                if (!newSet.add(num)) {   // meaning: If I cannot add this number
                    return true;  // returns true when duplicates present
                }
            }
            return false;
        }

    //3. Find Intersection of Two Arrays

        public static void intersectionOfArr(int[] arr1, int[] arr2) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> result = new HashSet<>();

            for (int i : arr1) {
                set1.add(i);
            }

            for (int j : arr2) {
                if (set1.contains(j)) {
                    result.add(j);
                }
            }
            System.out.println(result);
        }


    public static void main(String[] args) {
            int[] arr = {3, 5, 1, 2, 4, 4, 2, 3, 4, 4, 5, 5};
            int[] arr2 = {3, 4, 5, 6};
            removeDuplicates(arr);
            System.out.println(checkDuplicates(arr));
            intersectionOfArr(arr,arr2);
        }
}
