package leetcode100;

import java.util.*;

public class question2 {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<Map<Character, Integer>, Integer> re_index = new HashMap<>();
        int index = 0;
        for (String str : strs) {
            Map<Character, Integer> map = new TreeMap<>();
            for (Character c : str.toCharArray()) {
                Integer temp = map.get(c);
                if (temp != null) {
                    map.put(c, temp + 1);
                } else map.put(c, 1);
            }
            Integer target = re_index.get(map);
            if (target == null) {
                re_index.put(map, index);
                List<String> list = new ArrayList<>();
                list.add(str);
                result.add(list);
                index++;
            } else {
                result.get(target).add(str);
            }
        }
        return result;
    }


}
