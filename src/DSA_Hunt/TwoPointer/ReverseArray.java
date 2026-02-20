package DSA_Hunt.TwoPointer;

/*
Use two pointers — one at the start and one at the end. Swap elements and move pointers toward the center.
 */

//Logic:
//Use two pointers from start and end, swap elements, and move pointers toward the center until they meet

public class ReverseArray {

    public void reverseArray1(int[] arr){

        int left = 0;
        int right = arr.length-1;

        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
    }

    public void reverseArray2(int[] arr){
        for(int i=0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }

    public static void main(String[] args) {
        int[] elementsOfArray = {11,22,33,44,55};
        ReverseArray obj = new ReverseArray();
        obj.reverseArray1(elementsOfArray);
        System.out.print("While loop: ");
        for(int i: elementsOfArray) {
            System.out.print(i+" ");
        }

        int[] elements = {10,20,30,40,50};
        ReverseArray obj2 = new ReverseArray();
        obj2.reverseArray2(elements);
        System.out.print("\nFor loop: ");
        for(int i: elements){
            System.out.print(i+" ");
        }
    }
}

