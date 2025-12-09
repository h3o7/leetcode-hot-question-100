package leetcode100.graphtheory;

import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();
        map.put('1', 1);
        map.put('2', 2);
        map.put('3', 3);
        System.out.println(helper(map));

    }

    public static int helper(Map<Character, Integer> map) {
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()  + ":" + entry.getValue());
            if(entry.getKey()=='1'){
                return entry.getValue() * 7;
            }
        }
        return 0;
    }
}
