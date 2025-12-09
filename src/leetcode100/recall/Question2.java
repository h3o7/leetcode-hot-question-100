package leetcode100.recall;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        System.out.println(list1);
        List<Integer> list2 = new ArrayList<>(list1);
        System.out.println(list2);

//        System.out.println(list1);
//        System.out.println(list2);
    }


    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        if (nums.length == 0) return null;

        result.add(new ArrayList<>());  // 初始化空集

        for (int num : nums) {
            helper(num, result.size());
        }
        return result;

    }

    public void helper(int num, int size) {
        for (int i = 0; i < size; i++) {
            List<Integer> list = new ArrayList<>(result.get(i));
            list.add(num);
            result.add(list);
        }
    }

}
