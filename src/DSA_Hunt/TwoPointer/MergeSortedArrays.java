package DSA_Hunt.TwoPointer;

// time complexity: O(n + m)  -> Because each element is visited once.
// space complexity: O(n + m) -> Because we create a new array of size n + m.

/*
Use 3 pointers:

i → traverse arr1

j → traverse arr2

k → fill result

Compare elements from both arrays.

Insert smaller element into result.

Move corresponding pointer.

After one array finishes → copy remaining elements.
 */

public class MergeSortedArrays {

    public int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] result = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {       //Compare and insert smaller element.
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                k++;
                i++;
            } else {
                result[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i < n) {   //Copy if remaining from arr1.
            result[k++] = arr1[i++];
        }

        while (j < m) {   //Copy if remaining from arr2.
            result[k++] = arr2[j++];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 0, 0, 1, 3, 5};
        int[] arr2 = {2, 4, 6};

        MergeSortedArrays obj = new MergeSortedArrays();
        int[] result = obj.merge(arr1, arr2);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
