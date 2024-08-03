package ConsumerProducer;

import java.util.LinkedList;

public class ListNode {
    ListNode next;
    int val;

    public ListNode(){};

    public ListNode(int value) {
        this.val = value;
    }
    public ListNode(int val, ListNode next) {
        this.val =val;
        this.next = next;
    }

    public static void main(String[] args) {

        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next= new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(6);

        ListNode root2  = new ListNode(2);
        root2.next = new ListNode(4);
        root2.next.next= new ListNode(6);
        root2.next.next.next = new ListNode(8);
        reorderList(root);
        print(root);

    }

    public static int mid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            return slow.next.val;
        }
        return slow.val;
    }
    public static void deleteDuplicates(ListNode head) {
        if (head == null) {
            return;
        }
//        if (head.val == head.next.val) {
//            head = head.next;
//            return;
//        }
        ListNode temp = head;
        while (temp != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
    }
    public static void print(ListNode root) {
        while (root != null) {
            System.out.print(root.val +" ");
            root = root.next;
        }
    }
    public static int countNode(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
    public static ListNode pairwiseSwap(ListNode head)
    {
        // code here
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode newHead = head.next;
        while(prev != null && prev.next != null) {
            prev.next = curr.next;
            curr.next = prev;

            prev = prev.next;
            if (curr != null && curr.next != null) {
                curr = prev.next;
            }

        }
        return newHead;
    }

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode m = middle(head);
        System.out.println(m.val);
        ListNode head2 = m.next;
        head2 = reverse(head2);
        print(head2);
        m.next = null;

        print(head);

        ListNode curr1 = head;
        ListNode curr2 = head2;

        while (curr1 != null && curr2 != null) {
            ListNode temp1 = curr1.next;
            ListNode temp2 = curr2.next;

            curr1.next = curr2;
            curr2.next = temp1;

            curr1 = temp1;
            curr2 = temp2;
        }

    }
    public static ListNode middle(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;
        ListNode nxt = null;
        while (curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }

}
