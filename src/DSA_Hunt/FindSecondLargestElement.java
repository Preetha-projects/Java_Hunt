package DSA_Hunt;

/*
         ┌───────────────┐
         │     Start     │
         └───────┬───────┘
                 │
                 ▼
        ┌─────────────────────┐
        │ Initialize          │
        │ largest = MIN       │
        │ secondLargest = MIN │
        └─────────┬───────────┘
                  │
                  ▼
        ┌─────────────────────┐
        │ Take next element   │
        │ from array (num)    │
        └─────────┬───────────┘
                  │
                  ▼
          ┌───────────────┐
          │ num > largest?│
          └───────┬───────┘
           Yes    │      No
                  ▼
        ┌──────────────────────────┐
        │ secondLargest = largest  │
        │                          │
        │ largest = num            │
        └─────────┬────────────────┘
                  │
                  ▼
        (Go to next element)

      If NO from (num > largest?)
                │
                ▼
        ┌─────────────────────────────┐
        │ num > secondLargest AND     │
        │ num != largest ?            │
        └─────────┬───────────────────┘
            Yes   │      No
                  ▼
        ┌─────────────────────┐
        │ secondLargest = num │
        └─────────┬───────────┘
                  │
                  ▼
        (Go to next element)

     After all elements processed
                   │
                   ▼
        ┌────────────────────────┐
        │ secondLargest == MIN ? │
        └─────────┬──────────────┘
               Yes│       No
                  ▼
        ┌──────────────────┐   ┌──────────────────────────┐
        │ Print "No second │   │ Print secondLargest      │
        │ largest number"  │   └──────────────────────────┘
        └─────────┬────────┘
                  │
                  ▼
             ┌─────────┐
             │   End   │
             └─────────┘

 */

public class FindSecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 8, 2, 15};

        int largest = Integer.MIN_VALUE; //stores the minimum possible value for any integer variable in Java, i.e -2^31 = -2147483648
        int secondLargest = Integer.MIN_VALUE;

        for(int num:arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }
            else if(num > secondLargest && num!=largest){
                secondLargest=num;
            }
        }

        if(secondLargest==Integer.MIN_VALUE){
            System.out.println("No second largest number");
        }
        else{
            System.out.println("Second largest number is: " + secondLargest);
        }
    }
}


