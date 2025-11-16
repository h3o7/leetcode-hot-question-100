package leetcode100.linkedList;

import java.util.LinkedHashMap;
import java.util.Map;

public class Question10 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) return head;
        Map<Integer, ListNode> map = new LinkedHashMap<>();
        int index = 1;

        while (head != null) {
            map.put(index++, head);
            head = head.next;
        }

        map.forEach((key, value) -> {
            if (key % k != 0) return;
            for (int i = 0; i < k; i++) {
                if (i != k - 1) {
                    map.get(key - i).next = map.get(key - i - 1);
                } else {
                    map.get(key - i).next = map.get(key + 1);
                }
            }
            if (map.get(key - 2 * k + 1) == null) return;
            map.get(key - 2 * k + 1).next = map.get(key);
        });

        return map.get(k);
    }

}
