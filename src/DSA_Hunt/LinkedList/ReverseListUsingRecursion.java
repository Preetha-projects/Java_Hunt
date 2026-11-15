package DSA_Hunt.LinkedList;

public class ReverseListUsingRecursion {
    // Basic singly linked list node.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            ListNode current = this;
            while (current != null) {
                sb.append(current.val);
                if (current.next != null) {
                    sb.append(" -> ");
                }
                current = current.next;
            }
            return sb.toString();
        }
    }

    static class Solution {
        public ListNode reverseList(ListNode head) {
            // Base case: empty list or last node.
            if (head == null || head.next == null) {
                return head;
            }

            // Reverse the rest of the list and relink current node.
            ListNode newHead = reverseList(head.next);
            head.next.next = head;
            head.next = null;

            return newHead;
        }
    }

    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        System.out.print("Original list: ");
        printList(head);
        System.out.println("Original list using node.toString(): " + head);

        Solution solution = new Solution();
        ListNode reversed = solution.reverseList(head);

        System.out.print("Reversed list: ");
        printList(reversed);
        System.out.println("Reversed list using node.toString(): " + reversed);
    }
}
