package LinkedList;

import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        ListNode h1 = new ListNode();
        h1.add(1);
        h1.add(2);
        h1.add(24);
        h1.add(1);
        System.out.println(mid(h1));


    }

    public static ListNode mid(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null || fast.next.next != null) {
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
        while (fast.next != null || fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode temp;
        return false;
    }

}
