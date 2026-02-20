package DSA_Hunt;

/*
Time Complexity	 O(n)
Space Complexity O(1)
*/

public class CountOfEvenNum {
    public int counting(int[] arr){

        if( arr==null || arr.length==0){
            throw new IllegalArgumentException ("Array is empty or null");
        }

        int count = 0;

        for(int i: arr){
            if(i%2==0){
                count+=1;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] numbers = {2,5,3,1,6};
        CountOfEvenNum obj = new CountOfEvenNum();
        System.out.println(obj.counting(numbers));
    }
}
