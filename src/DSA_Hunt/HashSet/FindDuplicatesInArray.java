package DSA_Hunt.HashSet;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesInArray {

    public static Set<Integer> allDuplicates(int[] arr) {

        Set<Integer> setSeen = new HashSet<>();
        Set<Integer> setResult = new HashSet<>();

        for(int num:arr) {
            if(!setSeen.contains(num)){
                setSeen.add(num);
            }
            else{
                setResult.add(num);
            }
        }
        return setResult;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};   //Output: [2,3]

        Set<Integer> duplicates = allDuplicates(arr);

        System.out.println("Duplicates: " + duplicates);
    }
}
