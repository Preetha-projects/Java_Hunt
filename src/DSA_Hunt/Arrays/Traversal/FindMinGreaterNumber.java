package DSA_Hunt.Arrays.Traversal;

public class FindMinGreaterNumber {
    public static int findMinGreaterNumber(int[] arr, int target) {
        int minGreater = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num > target && num < minGreater) {
                minGreater = num;
            }
        }
        return minGreater == Integer.MAX_VALUE ? -1 : minGreater; // Return -1 if no greater number is found
    }

    public static void main(String[] args) {
        int[] arr = {2 ,8 , 7, 3, 4, 1, 6};
        int target = 3;
        System.out.println(findMinGreaterNumber(arr, target));
    }
}
