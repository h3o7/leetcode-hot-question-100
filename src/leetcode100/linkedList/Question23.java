package leetcode100.linkedList;

public class Question23 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode nextNode = head.next;
        ListNode tempNode = head;
        ListNode p;
        while (nextNode != null) {
            p = nextNode.next;
            nextNode.next = tempNode;
            tempNode = nextNode;
            nextNode = p;
        }
        head.next = null;
        return tempNode;

    }

}
