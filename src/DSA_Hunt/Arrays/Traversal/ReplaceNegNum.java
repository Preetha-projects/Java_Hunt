package DSA_Hunt.Arrays.Traversal;

public class ReplaceNegNum {
    public static int[] replaceNum(int[] arr) {

        for (int i=0; i<arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
        return arr;
    }

    public static int[] replaceNeg(int[] arr) {

        int[] newArr  = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < 0) {
                newArr[i] = 0;
            }
            else{
                newArr[i]=arr[i];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {2, -2, 3, -4, 1, -1, 5, 1};
//        int[] newArray = replaceNum(arr); // both arr and newArray point to same memory.
//            for (int i : newArray) {
//                System.out.print(i + " "); //Modified the original array
//            }
            int[] newArray2 = replaceNeg(arr); // newArray2 points to a different memory location.
            for (int i : newArray2) {
                System.out.print(i + " ");//Original array remains unchanged.
            }
            System.out.println();
            for (int i : arr) {
                System.out.print(i + " ");//Original array remains unchanged.
            }
    }
}
