package LinkedList;

import lombok.Getter;
import lombok.Setter;


public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    ListNode head;
    public void add(int val) { 
        this.val = val;
    }

    public int getData() {
        return val;
    }
    public ListNode getNext() {
        return next;
    }

}