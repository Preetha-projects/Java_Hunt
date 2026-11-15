package DSA_Hunt.Search;

public class FirstAndLastPosition {
         public static void main(String[] args) {
             int[] ans={-1,-1};
             int[] nums = {5,7,7,8,8,8,10};
             int target=8;
             ans[0] = binarySearch(nums,target,true);
             ans[1] = binarySearch(nums,target,false);
             System.out.println("{"+ans[0] +","+ ans[1]+"}");
        }

        public static int binarySearch(int[] nums, int target, boolean firstOrLast){
            int low=0;
            int high=nums.length-1;
            int ans=-1;
            while(low<=high){
                int mid=low+(high-low)/2;

                if(nums[mid]==target){
                    ans=mid;
                    if (firstOrLast) {
                        high = mid - 1;
                    }
                    else {
                        low = mid + 1;
                    }
                }
                else if(nums[mid]>target){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            return ans;
        }
}
