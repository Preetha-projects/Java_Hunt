package DSA_Hunt.Arrays.Algorithms.FloydsCycleDetection;

/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.

    head
     ↓
    [1 | •] → [2 | •] → [3 | null]

Each box is a node:
    left side = value
    right side = pointer to next node

 */
public class LinkedListCycle {
    //the method receives the starting node of the linked list as input.
    public static boolean hasCycle(ListNode head) { // head stores the address/reference of the first node.
        ListNode slow = head;  //Create a pointer called slow and make it point to the same node as head
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        // Input: [3,2,0,-4], pos = 1

        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        // Linking nodes
        head.next = second;
        second.next = third;
        third.next = fourth;

        // Creating cycle:
        // tail connects to node at index 1 (value 2)
        fourth.next = second;

        // Check cycle
        boolean result = hasCycle(head);

        System.out.println("Output: " + result);
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
     }
  }
