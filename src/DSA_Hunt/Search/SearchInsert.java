package DSA_Hunt.Search;
/*

Lower Bound Definition:
    Return the index if target is found. Otherwise, return where it should be inserted

Search Insert Position:
    Find the first element that is greater than or equal to target
 */
public class SearchInsert {

    public static int searchInsert(int[] nums, int target) {
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
        return left;
    }
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 11};

        //int target = 7;
         int target=10;   //output: 5
        int result = searchInsert(arr, target);

        System.out.println(result);
    }
}
