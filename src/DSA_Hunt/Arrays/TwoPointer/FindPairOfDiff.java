package DSA_Hunt.Arrays.TwoPointer;

public class FindPairOfDiff {
    public int[] findPair(int[] arr, int target) {

        int i=0;
        int j=1;

        while (i<arr.length && j<arr.length){
            int diff = arr[j] - arr[i];
            if (diff == target){
                return new int[] {arr[i], arr[j]};
            }
            else if (diff < target) {
                j++;
            }
            else {
                i++;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 2;

        FindPairOfDiff obj = new FindPairOfDiff();
        int[] pair = obj.findPair(arr, target);
        if (pair != null) {
            System.out.println("Pair found: " + pair[0] + ", " + pair[1]);
        } else {
            System.out.println("No pair found with that difference " + target);
        }
    }
}
