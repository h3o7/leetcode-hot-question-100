package leetcode100.hash;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Question3 {

    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();

        for (int num : nums) {
            map.put(num, num);
        }
        if (map.size() == 0) return 0;
        int count = 1;
        int max_length = 1;
        Integer temp = null;
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (entry.getValue().equals(temp)) {
                count++;
                temp++;
            } else {
                max_length = Math.max(count, max_length);
                count = 1;
                temp = entry.getValue() + 1;
            }
        }
        max_length = Math.max(count, max_length);
        return max_length;
    }

}
