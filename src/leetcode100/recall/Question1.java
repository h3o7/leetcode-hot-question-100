package leetcode100.recall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question1 {
    public static List<List<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
       int[] nums = {1,2,3,4};
        System.out.println(permute(nums));


    }


    public static List<List<Integer>> permute(int[] nums) {
        helper(nums, 0);
        return result;
    }

    public static void helper(int[] nums, int index) {
        if (index == nums.length - 1) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            result.add(list);
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            helper(nums, index + 1);
            swap(nums, i, index);
        }
    }

    public static void swap(int[] nums, int x, int y) {
        int temp = nums[y];
        nums[y] = nums[x];
        nums[x] = temp;
    }

}
