package DSA_Hunt.TwoPointer;

/*
Keep first element
Compare next element
If different → move forward and store it
If same → skip
 */

//Time Complexity: O(n)
//Space Complexity: O(1) (in-place)

/*
What Is Slow & Fast Pointer? Using two pointers moving at different speeds through a data structure
How It Works? fast scans entire array and slow stores position of unique element
 */

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int slow = 0; // pointer for unique elements

        for (int fast = 1; fast < nums.length; fast++) {

            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }

        return slow + 1; // number of unique elements
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4, 4};

        int length = removeDuplicates(arr);

        System.out.println("Unique Count: " + length);

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


