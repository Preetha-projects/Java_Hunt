package DSA_Hunt.TwoPointer;

/*
Time → O(n)
Space → O(n)
 */
public class squaredSortedArray {

    public int[] squaredArray(int[] arr){

        int i =0;
        int j = arr.length-1;
        int k = arr.length-1;
        int[] result = new int[arr.length];

        while(i<=j){ // Because when pointers meet, That element still needs to be squared and inserted.
            int leftSquare = arr[i]*arr[i];
            int rightSquare = arr[j]*arr[j];
            if (leftSquare > rightSquare) {
                result[k] = leftSquare;
                i++;
            }
            else {
                result[k] = rightSquare;
                j--;
            }
            k--;
         }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-4,-3,-2, 5,6,9};

        squaredSortedArray obj = new  squaredSortedArray();
        int[] finalArray = obj.squaredArray(arr);

        System.out.print("Sorted array after squaring: " );
        for (int i : finalArray){
            System.out.print(i + " ");
        }
    }
}
