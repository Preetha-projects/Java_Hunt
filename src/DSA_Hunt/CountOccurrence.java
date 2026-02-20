package DSA_Hunt;

/*
Time Complexity	 O(n)
Space Complexity O(1)
*/

public class CountOccurrence {
    public static int countOccurrence(int[] arr, int target) {
        int count = 0;
        for (int i : arr) {
            if (i == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 1, 1, 5, 1};
        int target = 1;
        System.out.println(countOccurrence(arr, target));
    }
}
