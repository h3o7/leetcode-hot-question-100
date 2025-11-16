package leetcode100.linkedList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Question4 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        System.out.println(set.add(1));
        System.out.println(set.add(1));


    }


    public boolean hasCycle(ListNode head) {
        Map<ListNode, Integer> map = new HashMap<>();
        ListNode p = head;
        while (p != null) {
            Integer re = map.put(p, p.val);
            if (re != null) return true;
            p = p.next;
        }
        return false;
    }

}
