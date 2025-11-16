package leetcode100.linkedList;

import java.util.HashSet;
import java.util.Set;

public class Question5 {

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();

        ListNode p = head;
        while (p != null) {
            if (!set.add(p)) return p;
            p = p.next;
        }
        return null;
    }

}
