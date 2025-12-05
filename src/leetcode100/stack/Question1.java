package leetcode100.stack;

import java.util.*;

public class Question1 {

    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Deque<Character> deque = new LinkedList<>();

        for (Character c : s.toCharArray()) {
            Character temp = map.getOrDefault(c, '0');
            if (temp != '0') {
                deque.addLast(c);
                continue;
            }
            if (deque.isEmpty()) return false;
            temp = deque.removeLast();
            if (map.getOrDefault(temp, '0') != c) return false;
        }
        if (!deque.isEmpty()) return false;
        return true;

    }

}
