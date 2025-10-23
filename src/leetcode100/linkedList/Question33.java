package leetcode100.linkedList;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Question33 {

    public static Node copyRandomList(Node head) {
        List<Node> list = new ArrayList<>();
        // LinkedHashMap : 会按照插入顺序进行存储
        Map<Node, Integer> map = new LinkedHashMap<>();
        Node newHead = new Node(-1);
        Node p = newHead;
        int count = 0;

        while (head != null) {
            map.put(head, count++);
            Node temp = new Node(head.val);
            list.add(temp);

            p.next = temp;
            p = p.next;
            head = head.next;

        }

        var ref = new Object() {
            int index = 0;
        };
        map.forEach((k, v) -> {
            Integer re = map.get(k.random);
            if (re == null) {
                list.get(ref.index).random = null;
            } else list.get(ref.index).random = list.get(re);
            ref.index++;
        });

        return newHead.next;


    }

    public static Node betterMethod(Node head) {
        Node p = head;
        Map<Node, Node> map = new HashMap<>();

        while (p != null) {
            map.put(p, new Node(p.val));
            p = p.next;
        }

        p = head;

        while (p != null) {
            map.get(p).next = map.get(p.next);
            map.get(p).random = map.get(p.random);
            p = p.next;
        }

        return map.get(head);

    }

}
