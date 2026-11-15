package DSA_Hunt.Arrays.Traversal;

public class FindMaxAndMin {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 60};
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
            else if (max < arr[i]) max = arr[i];
        }
        System.out.println("Difference between max and min is: " + (max - min));
    }
}
