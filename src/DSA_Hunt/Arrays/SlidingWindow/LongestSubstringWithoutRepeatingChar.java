package DSA_Hunt.Arrays.SlidingWindow;

/*
variable window approach - the window size changes dynamically based on a condition.

Problem Statement:
Given a string s, find the length of the longest substring without repeating characters.

| Window                 | Set   | Max |
| ---------------------- | ----- | --- |
| p                      | p     | 1   |
| pw                     | p,w   | 2   |
| w (duplicate) → shrink | w     | 2   |
| wk                     | w,k   | 2   |
| wke                    | w,k,e | 3   |
| kew                    | k,e,w | 3   |

Time Complexity: O(n) - Each character is visited at most twice (once when added to the set and once when removed).
Space Complexity: O(min(m, n)) - The space used by the set is at most the size of the longest substring without repeating characters,
which is limited by the number of unique characters in the string (m) and the length of the string (n).
*/


import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChar {

    public static int lengthOfLongestSubstring(String word) {

        int left = 0;
        int maxLength = 0;

        Set<Character> set = new HashSet<>(); //To store unique characters in the current window.
        for (int right = 0; right < word.length(); right++) {
            while (set.contains(word.charAt(right))) {   //Use while, Not if, because there can be multiple duplicates in the current window. We need to shrink the window until there are no duplicates.
                set.remove(word.charAt(left));
                left++;
            }
            set.add(word.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String word = "pwwkew";
        System.out.println("The length of the longest substring: " + lengthOfLongestSubstring(word));
    }
}
