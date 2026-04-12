package DSA_Hunt.HashSet;

import java.util.HashSet;
import java.util.Set;
// Array → Set → Find sequence starts → Expand → Track max

public class LongestConsecutiveSequence {

    public static int longestConsecutiveSequence(int[] arr){
        Set<Integer> set = new HashSet<>();

        for (int i:arr) {
            set.add(i);
        }

        int maxLength=0;
        for (int num:arr) {
            if(!set.contains(num-1)) { //start of sequence
                int current=num;
                int length=0;

                while(set.contains(current)) {
                    current++;
                    length++;  // update length of current sequence
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 4, 4, 9, 8, 7, 10, 11, 12, 13, 14, 15};
        System.out.println(longestConsecutiveSequence(arr));
    }

}
