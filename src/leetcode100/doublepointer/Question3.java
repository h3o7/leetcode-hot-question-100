package leetcode100.doublepointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question3 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            // 跳过重复的第一个元素
            if (i > 0 && nums[i] == nums[i-1]) continue;
            if (nums[i] > 0) break;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.addAll(List.of(nums[i], nums[left], nums[right]));
                    list.add(temp);

                    // 跳过重复元素
                    while (left < right && nums[left] == nums[left+1]) left++;
                    while (left < right && nums[right] == nums[right-1]) right--;

                    // 移动指针寻找下一组解
                    left++;
                    right--;
                }
            }
        }
        return list;
    }


}
