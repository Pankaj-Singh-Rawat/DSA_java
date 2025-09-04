package strings;

public class SlowAndFastPointer {
    public static void main(String[] args) {
        // Fast and Slow Pointers (Tortoise and Hare) 🐢🐇

        // The Fast and Slow Pointers technique uses two pointers that traverse a data
        // structure (usually a linked list or an array) at different speeds. This
        // pattern is incredibly effective for solving problems involving cycles or
        // determining the length of a data structure.

        // The two main scenarios are:

        // Finding/Detecting a Cycle: The fast pointer moves two steps at a time, and
        // the slow pointer moves one step at a time. If there's a cycle, the fast
        // pointer will eventually "lap" the slow pointer and they will meet at some
        // point inside the cycle.

        // Finding a Specific Position: The pointers move at different speeds until one
        // reaches a certain condition (e.g., a fast pointer reaching the end of a list
        // to find the middle element).

        // Question 1 (Cycle Detection)
        // Task:
        // You're given the head of a singly linked list. Your task is to determine if
        // it has a cycle. Return true if it does, and false if it doesn't.

        // Example:
        // Input: head = [3, 2, 0, -4], where the last node links back to the node with
        // value 2.
        // Output: true

        // Input: head = [1, 2], where the last node links to null.
        // Output: false

        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(0);
        head1.next.next.next = new ListNode(-4);
        head1.next.next.next.next = head1.next;

        System.out.println("has cycle? : " + problem1(head1));
    }


    private static boolean problem1(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while( fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}

