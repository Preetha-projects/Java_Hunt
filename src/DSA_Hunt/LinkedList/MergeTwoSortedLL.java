package DSA_Hunt.LinkedList;

/*
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.

Algorithm:

    1. If one list is empty, return the other list.
    2. Decide the head:
        Compare first nodes of list1 and list2
        Smaller node becomes head
        Also set current = head
    3. Move forward in the list whose node was chosen.
    4. While both lists are not null:
        Compare current nodes
        Attach smaller node using: current.next = smallerNode;
    5. Move:
        current
        the list pointer from which node was taken
    6. After loop:
        One list may still remain
        Attach remaining nodes: current.next = remainingList;
    7. Return head


 */
public class MergeTwoSortedLL {
}
