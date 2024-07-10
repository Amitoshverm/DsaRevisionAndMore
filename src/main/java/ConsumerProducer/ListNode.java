package ConsumerProducer;

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
        root.next = new ListNode(1);
        root.next.next= new ListNode(2);
        root.next.next.next = new ListNode(3);
        root.next.next.next.next = new ListNode(3);
        System.out.println(mid(root));
//        deleteDuplicates(root);
        System.out.println(countNode(root));
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
            count++;
            temp = temp.next;
        }
        return count;
    }
}
