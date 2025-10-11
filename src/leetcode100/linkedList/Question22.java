package leetcode100.linkedList;

public class Question22 {
    public static void main(String[] args) {
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(2);
        p1.nextNode(p2);
        System.out.println(p1);
        System.out.println(p1.val + ":" + p1.next);

        System.out.println("--------------------");

        System.out.println(p2);
        System.out.println(p2.val + ":" + p2.next);

        System.out.println("--------------------");

        System.out.println(p1.next.val + ":" + p1.next.next);

    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA;
        ListNode B = headB;
        while (A != B) {
            A = A != null ? A.next : headB;
            B = B != null ? B.next : headA;
        }
        return A;

    }


}


