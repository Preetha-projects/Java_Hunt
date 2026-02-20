package DSA_Hunt.TwoPointer;

/*
Time Complexity: O(n)
Space Complexity: O(1) (no extra memory used)
*/

public class PalindromeCheck {

    public static boolean palindromeCheck(String word){

        int left = 0;
        int right = word.length()-1;
        boolean isPalindrome=true;
        word = word.toLowerCase();

        while(left<right){
            if (word.charAt(left)!=word.charAt(right)){
                isPalindrome =false;
                break;
            }
            left++;
            right--;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        String str = "Madam";
        if(palindromeCheck(str)){
            System.out.println(str+" is a palindrome");
        }
        else{
            System.out.println(str+" is not a palindrome");
        }
    }
}
