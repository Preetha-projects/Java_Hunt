package DSA_Hunt.Arrays.SlidingWindow;
/*
Problem: Maximum Number of Vowels in a Substring of Size K
Given a string S and an integer K, find the maximum number of vowels present in any substring of size K.
Vowels are: a, e, i, o, u (both lowercase and uppercase if specified).

Time Complexity: O(n) - Each character is visited at most twice (once when added to the count and once when removed).
Space Complexity: O(1) - We are using a constant amount of space to store the
 */

public class MaxNoOfVowels {

    public static int maxVowels (String word, int k) {
        int count =0;
        for (int i=0; i<k; i++) {
            char ch = word.charAt(i);
            if (isVowel(ch))
                count++;
        }

        int maxCount = count;

        for (int i=k; i<word.length(); i++){

            if (isVowel(word.charAt(i)))
                count++;

            if (isVowel(word.charAt(i-k)))
                count--;

            maxCount=Math.max(maxCount,count);

       }
        return maxCount;
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        String word = "abciiidef";
        int k = 3; // Size of the substring
        System.out.println(maxVowels(word,k));
    }
}
