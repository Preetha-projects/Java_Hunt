package DSA_Hunt.StackAndQueue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/*
Problem: First Non-Repeating Character Using Queue

Given a string S consisting of lowercase English letters, find the first non-repeating character in the string using a queue-based approach.
A character is said to be non-repeating if it appears exactly once in the string.

Algorithm:
1. Traverse the string.
2. For each character:
    Increment its count.
    Push it into the queue.
3. While the front of the queue has count > 1, remove it.   We keep removing (poll) characters from the front if they are repeating, so that the front always holds a valid non-repeating character.
4.The front of the queue will be the first non-repeating character.

Input:
S = "aabccbd"

Output:
d

 */
public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "aabccbd";

        Map<Character, Integer> freq = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();

        for (char ch : str.toCharArray()) {
            // Step 1: update frequency
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

            // Step 2: add to queue
            queue.add(ch);
System.out.println(queue);
            // Step 3: remove repeating characters from front
            while (!queue.isEmpty() && freq.get(queue.peek()) > 1) {
                System.out.println(queue.poll() + " is repeating, removing from queue");
            }
        }

        // Result
        if (!queue.isEmpty()) {
            System.out.println("First non-repeating character: " + queue.peek());
        } else {
            System.out.println("No non-repeating character found");
        }
    }
}
