package DSA_Hunt.Search;

/*
 A peak element is an element that is greater than its neighbors. Return index of any peak element. First and last element can also be peak if they are greater than their only neighbor.
    If left neighbor is greater → peak exists on left side.
    If right neighbor is greater → peak exists on right side.
    Otherwise, current element is peak.

This works because at least one peak always exists.

Find middle element.
Compare with neighbors.
Move:
Left if left neighbor bigger
Right if right neighbor bigger
Repeat until peak found.
 */
public class PeakElement {
    public int findPeakElement(int[] nums) {
        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if((mid==nums.length-1 || nums[mid+1]<nums[mid]) && (mid==0 || nums[mid-1]<nums[mid])) {
                return mid;
            }
            else if(nums[mid+1]>nums[mid]){
                low=mid+1;
            }
            else if(nums[mid-1]>nums[mid]){
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        PeakElement pe = new PeakElement();
        int[] arr = {6, 4, 3, 2,5,1};
        //so in this case int[] arr = {6, 4, 3, 2,5,1}; eventually we can see index 4 is peak as per the logic it will give index 0
        System.out.println(pe.findPeakElement(arr)); // Output: 2
    }
}
