package leetcode100.linkedList;

public class Question7 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;

        ListNode m1 = new ListNode(5);
        ListNode m2 = new ListNode(6);
        ListNode m3 = new ListNode(4);
        m1.next = m2;
        m2.next = m3;

        ListNode result = addTwoNumbers(l1, m1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }



    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode p = result;
        boolean flag = false;


        while (l1 != null || l2 != null || flag) {

            ListNode node = new ListNode(0);
            if (flag) node.val = 1;
            if (l1 != null && l2 != null) {
                node.val += l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                node.val += l1.val;
                l1 = l1.next;
            } else if (l2 != null) {
                node.val += l2.val;
                l2 = l2.next;
            }

            if (node.val >= 10) {
                node.val = node.val % 10;
                flag = true;
            } else flag = false;


            p.next = node;
            p = p.next;

        }

        return result.next;
    }


}
