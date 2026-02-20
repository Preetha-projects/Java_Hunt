package CoreJava;

/*
Java is always pass-by-value, which means that when you pass a variable to a method, you are passing a copy of the variable's value.
* Primitive Variables:
1. Original value cannot change in the calling method.
2.Java sends actual value

* Objects / Arrays
When passing objects or arrays, the value being passed is the reference (address).
1. Method receives copy of address
2. Both point to same array
3. Changes affect original array
 */

public class PassByValueAndRef {
    public static void change(int num){
        num = 50;
    }

    public static void change(int[] num){
        num[0] = 50;
    }

    public static void main(String[] args){
        int x = 10;
        change(x);
        System.out.println("Unchanged" + x); // Output: 10, because the value of x is not changed in the main method.
        int[] arr = {1,2,3};
        change(arr);
        System.out.println("Modified" + arr[0]);    // Output: 50, because the reference to the array is passed, and the change is reflected in the main method.
    }

}
