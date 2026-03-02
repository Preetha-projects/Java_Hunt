package DSA_Hunt.Arrays.SlidingWindow;
import java.util.Arrays;

/*
//Only update 2 letters each time

Algorithm:
    1.Make frequency array for pattern
    2.Make frequency array for first window (first K letters)
    3.If both arrays match → count++
    4.Move window:
        Add new letter
        Remove old letter
        Compare arrays
    5.Repeat until end

Time Complexity → O(n)
Space Complexity → O(1)
 */

public class CountOccurrenceOfAnagrams {
    public static int countAnagrams(String text, String pattern) {

        int count = 0;
        int k = pattern.length();
        int[] freqPattern = new int[26];
        int[] freqWindow = new int[26];

        // Fill pattern frequency
        for (int i = 0; i < k; i++) {
            freqPattern[pattern.charAt(i) - 'a']++;
            freqWindow[text.charAt(i) - 'a']++;
        }

        // Check first window using Arrays.equals() method
//        if (Arrays.equals(freqPattern,freqWindow)) {
//            count++;
//        }

        // Check first window using custom method
        if (isSame(freqPattern,freqWindow)) {
            count++;
        }

        // Slide the window
        for (int i=k; i<text.length(); i++) {
            // Add new character
            freqWindow[text.charAt(i) - 'a']++;

            // Remove old character
            freqWindow[text.charAt(i-k) - 'a']--;

            if(Arrays.equals(freqPattern,freqWindow)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isSame(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String text = "abab";
        String pattern = "ab";

        int result = countAnagrams(text, pattern);

        System.out.println("Number of anagram occurrences: " + result);
    }
}
