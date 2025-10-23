package leetcode100.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Question35 {
    public static void main(String[] args) {

    }


    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null) return null;
        ListNode head = new ListNode(0);
        ListNode first = null;
        int index = 0;
        for (ListNode node : lists) {
            first = node;
            index++;
            if (first != null) break;
        }
        if (first == null) return first;
        int n = lists.length;
        head.next = first;

        for (int i = index; i < n; i++) {
            ListNode left = head.next;
            ListNode right = lists[i];

            // 合并有序链表
            ListNode temp = head;
            while (left != null && right != null) {
                if (left.val < right.val) {
                    temp.next = left;
                    left = left.next;
                } else {
                    temp.next = right;
                    right = right.next;
                }
                temp = temp.next;
            }
            temp.next = left != null ? left : right;
        }

        return head.next;

    }

}
