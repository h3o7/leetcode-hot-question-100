package leetcode100.ordinaryarray;

import java.util.*;

public class Question2 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1)
            return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        Map<Integer, Integer> map = new HashMap<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 0; i < intervals.length; i++) {
            if (end >= intervals[i][0]) {
                if (end >= intervals[i][1]) continue;
                end = intervals[i][1];
            } else {
                map.put(start, end);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        map.put(start, end);

        // 将map集合转换成二维数组
        return map.entrySet().stream()
                .map(e -> new int[]{e.getKey(), e.getValue()})
                .toArray(int[][]::new);
    }

}
