package DSA_Hunt.Arrays.SlidingWindow;
/*
Problem statement:
Given an integer array arr[] of size n and an integer k,
find the average of all contiguous subarrays of size k.
Return the result as a new array (or list) of doubles/floats.

Time Complexity: O(n)
Space Complexity: O(n - k + 1)
 */

public class AverageOfAllSubArrays {

    public static double[] avgOfSubArrays(int[] arr, int k){
        int n = arr.length;
        int sum=0;
        double[] result= new double[n-k+1];

        for(int i=0; i<k; i++){
            sum+=arr[i];
        }
        result[0]=(double) sum/k;

        int index = 1;
        for(int j=k; j<n; j++){
            sum=sum+arr[j]-arr[j-k] ;
            result[index++]=(double) sum/k;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;
        double[] result= avgOfSubArrays(arr, k);
        for (double d : result) {
            System.out.print(d+" ");
        }
    }
}
