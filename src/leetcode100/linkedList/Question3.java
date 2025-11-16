package leetcode100.linkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Question3 {

    public boolean isPalindrome(ListNode head) {
        ListNode p = head;
        List<Integer> list = new ArrayList<>();
        while (p != null) {
            list.add(p.val);
            p = p.next;
        }
        int n = list.size();
        for (int i = 0; i < n / 2; i++) {
            if (!Objects.equals(list.get(i), list.get(n - 1 - i))) return false;
        }
        return true;
    }

}
