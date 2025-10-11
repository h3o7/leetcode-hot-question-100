package leetcode100.linkedList;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void nextNode(ListNode next) {
        this.next = next;
    }
}
