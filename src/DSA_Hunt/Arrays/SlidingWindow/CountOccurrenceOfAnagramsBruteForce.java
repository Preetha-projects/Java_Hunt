package DSA_Hunt.Arrays.SlidingWindow;
/*

Problem Statement: Count Occurrences of Anagrams (Basic Version)
Given a string S and a string P, count how many substrings of S of length K (where K = length of P) are anagrams of P.
An anagram is a string formed by rearranging the characters of another string using all the original characters exactly once.

Algorithm:
    1. Take the length of pattern → call it K
    2. Start from the beginning of text
    3. Take first K letters - substring
    4. Check if it is an anagram of pattern - function to check anagram:
       a. If lengths are different → return false
       b. Create frequency array of size 26 (for lowercase letters)
       c. For each character in first string → increase frequency
       d. For each character in second string → decrease frequency
       e. If all values in frequency array are zero → return true, else false
    5. If yes → increase count
    6. Move one step forward
    7. Repeat until end
    8. Return total count

Approach	   Time Complexity	    Space Complexity
Brute Force	   O(nk)	             O(1)

 */
public class CountOccurrenceOfAnagramsBruteForce {

    // Function to check if two strings are anagrams
    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) return false;

        int[] freq = new int[26]; // for lowercase letters

        // Count characters from first string
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;    //Java converts characters to their ASCII values and subtracts them.
            //example: c' - 'a'     → 99 - 97 → 2 (index for 'c' in frequency array)
        }

        // Subtract characters from second string
        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i) - 'a']--;
        }

        // Check if all values are zero
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) return false;
        }

        return true;
    }

    // Function to count occurrences
    public static int countAnagrams(String text, String pattern) {

        int count = 0;
        int k = pattern.length();

        // Loop through all substrings of size k
        for (int i = 0; i <= text.length() - k; i++) {  //O(n-k+1) - We are iterating through the text to get all possible substrings of length k

            // Extract substring
            String sub = text.substring(i, i + k);    //O(k) - substring method takes O(k) time as it creates a new string of length k

            // Check if it's an anagram
            if (isAnagram(sub, pattern)) {  //O(k) - isAnagram method takes O(k) time as it processes two strings of length k
                count++;
            }
        }
        //O(n × k) - Overall time complexity is O(nk) due to the nested operations of extracting substrings and checking for anagrams.

        return count;
    }

    public static void main(String[] args) {

        String text = "abab";
        String pattern = "ab";

        int result = countAnagrams(text, pattern);

        System.out.println("Number of anagram occurrences: " + result);
    }
}
