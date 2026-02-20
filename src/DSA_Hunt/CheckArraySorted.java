package DSA_Hunt;

public class CheckArraySorted {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

        if(arr == null || arr.length == 0){
            System.out.println("Array is empty or null");
            return;
        }
        if(arr.length == 1){
            System.out.println("Array contains only one element, it is considered sorted");
            return;
        }

        boolean isSorted = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }

    public static class ArraysBasic {
        String[] fruits = {"Orange", "Kiwi", "Strawberry"};

        public void printFruits() {
            for (String fruit : fruits) {
                System.out.println(fruit);
            }
        }

        public static void main (String[] args) {
            ArraysBasic object = new ArraysBasic();
            object.printFruits();
            System.out.println(object.fruits[0]);  //access using index
        }
    }
}
