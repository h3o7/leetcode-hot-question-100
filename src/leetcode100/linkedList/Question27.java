package leetcode100.linkedList;

public class Question27 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            if (list1 == null) return list2;
            else return list1;
        }

        ListNode p1 = list1, p2 = list2, head;

        if (p1.val < p2.val) {
            head = p1;
            p1 = p1.next;
        } else {
            head = p2;
            p2 = p2.next;
        }

        ListNode tmp = head;

        while (p1 != null & p2 != null) {
            if (p1.val <= p2.val) {
                tmp.next = p1;
                p1 = p1.next;
            } else {
                tmp.next = p2;
                p2 = p2.next;
            }
            tmp = tmp.next;
        }
        if (p1 != null) tmp.next = p1;
        if (p2 != null) tmp.next = p2;
        return head;
    }

}
