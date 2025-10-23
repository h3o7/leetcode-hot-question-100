package leetcode100.linkedList;

public class Question31 {

    public ListNode swapPairs(ListNode head) {

        ListNode node = head;
        ListNode pre = null;
        if (node == null) return head;
        ListNode aft = node.next;

        while (node != null && aft != null) {
            if (pre != null) pre.next = aft;
            else head = aft;
            node.next = aft.next;
            aft.next = node;
            pre = node;
            node = node.next;
            if (node == null) break;
            aft = node.next;

        }

        return head;

    }




}
