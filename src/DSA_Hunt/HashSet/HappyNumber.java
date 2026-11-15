package DSA_Hunt.HashSet;

import java.util.Set;
import java.util.HashSet;

/*
A number is happy if:
    Replace the number with the sum of squares of its digits
    Repeat the process
    If you reach 1 → Happy. Ex: 19 → 1 + 81 = 82 → 64 + 4 = 68 → 36 + 64 = 100 → 1 + 0 + 0 = 1 ✅
    If it loops forever → Not Happy. Ex: 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4 🔁

Why HashSet?
👉 To detect cycles:
        Store each computed number in a HashSet
        If you see the same number again → loop detected
        Stop and return false

⏱️ Complexity
    Time: O(log n) Loop over digits → O(log n)
    Space: O(log n) (set stores intermediate values)
 */
public class HappyNumber {

    public static void detectCycle(int num) {
        Set<Integer> set = new HashSet<>();

        while (num!=1 && !set.contains(num)) {
            set.add(num);
            num = checkNum(num);
        }

        if(num==1) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Not a Happy Number");
        }
    }

    public static int checkNum(int num) {
        int sum = 0;
        while (num > 0) {
            num = num % 10;
            sum += num * num;
            num = num / 10;
        }
        return sum;
    }

     public static void main(String[] args) {
         int num = 19;
         detectCycle(num);
     }
}
