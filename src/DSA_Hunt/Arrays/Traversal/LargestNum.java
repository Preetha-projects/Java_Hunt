package DSA_Hunt.Arrays.Traversal;

/*
Time Complexity	O(n)
Space Complexity O(1)
*/

/* Algorithm:
Assume first element is largest

Compare it with remaining elements

Update largest when bigger value is found

Return largest
 */

public class LargestNum {

    public int largestEle(int[] arr){

        if(arr == null || arr.length == 0){  //Add Edge Case Handling
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int large = arr[0];

        for(int i=1; i<arr.length;i++){  //starting from 1 as we have already assigned arr[0] to large
            if(arr[i]>large){
                large = arr[i];
            }
        }
        return large;
    }

    public static void main(String[] args){
        int[] elements = {1, 5, 14, 8, 10};
        LargestNum obj = new LargestNum();
        System.out.println(obj.largestEle(elements));
    }
}
