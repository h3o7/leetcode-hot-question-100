package leetcode100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question9 {
    public static void main(String[] args) {



    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        // 边界检查
        if (s == null || p == null || s.length() < p.length()) {
            return list;
        }
        int left = 0;
        int pLength = p.length();
        int time = s.length() - p.length();
        Map<Character, Integer> mapRe = StrToMap(p);
        Map<Character, Integer> temp = StrToMap(s.substring(left, pLength + left));
        if (mapRe.equals(temp)) {
            list.add(left);
        }
        while (left < time) {
            // 移除首个元素
            Integer count = temp.get(s.charAt(left));
            if(count != 1){
                temp.put(s.charAt(left), count - 1);
            }else temp.remove(s.charAt(left));

            // 添加后一个元素
            Integer num = temp.get(s.charAt(pLength + left));
            if (num == null) {
                temp.put(s.charAt(pLength + left), 1);
            } else {
                temp.put(s.charAt(pLength + left), num + 1);
            }
            // 检查是否相等
            left++;
            if (mapRe.equals(temp)) list.add(left);
        }
        return list;

    }

    public Map<Character, Integer> StrToMap(String p) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            Integer num = map.get(p.charAt(i));
            if (num == null) {
                map.put(p.charAt(i), 1);
            } else {
                map.put(p.charAt(i), num + 1);
            }
        }
        return map;
    }
}
