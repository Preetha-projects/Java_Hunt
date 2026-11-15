package DSA_Hunt.Recursion;

/*
main
 |
 |--> printFun(3)
 |      print 3
 |      |
 |      |--> printFun(2)
 |      |      print 2
 |      |      |
 |      |      |--> printFun(1)
 |      |      |      print 1
 |      |      |      |
 |      |      |      |--> printFun(0)
 |      |      |             return
 |      |      |
 |      |      print 1
 |      |      return
 |      |
 |      print 2
 |      return
 |
 print 3
 return

 */

public class RecursionExample {
    static void printFun(int test)
    {
        if (test < 1)
        {
            return;
        }
        else {
            System.out.printf("%d ", test); // Going down the recursion
            printFun(test - 1);         // Explore smaller problem
            System.out.printf("%d ", test);  // Coming back up the recursion
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int test = 3;
        printFun(test);
    }
}
