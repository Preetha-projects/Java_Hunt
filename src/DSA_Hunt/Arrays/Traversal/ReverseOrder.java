package DSA_Hunt.Arrays.Traversal;

public class ReverseOrder {
    public static void main(String[] args) {
        int[] elements = {20,30,40,10,80};
        ReverseOrder obj = new ReverseOrder();
        obj.reversePrint(elements);
    }

    public void reversePrint(int[] arr) {
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }


}
