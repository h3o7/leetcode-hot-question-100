package leetcode100.ordinaryarray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Question5 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 3, 4};
        // 通过stream流对数组nums排序并过滤出重复的元素


        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        Integer i = map.get(1);
        System.out.println(i);
        Integer i1 = map.get(2);
        System.out.println(i1);
//        map.get
    }


    public int firstMissingPositive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        int[] newArr = Arrays.stream(nums).sorted().toArray();
        int n = nums.length;
        int result = 1;
        for (int i = 0; i < n; i++) {
            if (newArr[i] <= 0) continue;
            if (i > 0 && newArr[i] == newArr[i - 1]) continue;
            Integer temp = map.get(newArr[i]);
            if (temp == null) break;
            map.remove(temp);
            map.put(temp + 1, temp + 1);
            result = temp + 1;
        }
        return result;

    }


}
