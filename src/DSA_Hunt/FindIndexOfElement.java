package DSA_Hunt;

public class FindIndexOfElement {
    public static int indexOfElement(int[] arr, int ele){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==ele){
                return i; // Return the index of the first occurrence of the element
            }
        }
        return -1; // Return -1 if the element is not found in the array
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 1, 1, 5, 1};
        int element = 1;
        System.out.println(indexOfElement(arr, element));
    }
}
