package DSA_Hunt.Search;

public class ExactSearch {
    public static int binarySearch(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid= left+(right-left)/2;

            if(nums[mid]==target) {
                return mid;
            }
            else if(nums[mid]>target) {
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 11};

        int target = 7;
       // int target=10;   output: -1
        int result = binarySearch(arr, target);

        System.out.println(result);
    }
}
