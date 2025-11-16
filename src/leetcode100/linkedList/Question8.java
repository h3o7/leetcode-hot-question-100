package leetcode100.linkedList;

import java.util.ArrayList;
import java.util.List;

public class Question8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.get(list.size() - 1));
    }


    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> list = new ArrayList<>();

        ListNode p = head;
        while (p != null) {
            list.add(p);
            p = p.next;
        }
        int length = list.size();
        if (length - n - 1 < 0) {
            return head.next;
        }
        ListNode preNode = list.get(length - n - 1);

        preNode.next = list.get(length - n).next;

        return head;


    }


}
