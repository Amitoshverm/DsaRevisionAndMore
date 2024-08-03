package LinkedList;

import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        ListNode h1 = new ListNode(1);
        h1.next = new ListNode(2);
        h1.next.next = new ListNode(3);;
        h1.next.next.next = new ListNode(4);;
        h1.next.next.next.next = new ListNode(5);;

        System.out.println(mid(h1).val);


    }

    public static ListNode mid(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            return  true;
        }

        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode temp;
        return false;
    }

}
