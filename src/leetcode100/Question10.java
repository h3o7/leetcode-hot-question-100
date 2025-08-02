package leetcode100;

import java.util.HashMap;
import java.util.Map;

public class Question10 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,2,3,4,5};
        int k = 5;
        System.out.println(betterMethod(nums, k));
    }

    public int subarraySum(int[] nums, int k) {
        int[] temp = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
            if (temp[i] == k) sum++;
            for (int j = 0; j < i; j++) {
                temp[j] = temp[j] + nums[i];
                if (temp[j] == k) sum++;
            }
        }
        return sum;

    }

    public static int betterMethod(int[] nums, int k) {
        Map<Integer, Integer> preSum = new HashMap<>();
        // 初始化前缀和为0的出现次数为1
        preSum.put(0, 1);
        int sum = 0, count = 0;
        for (int num : nums) {
            sum += num;
            count += preSum.getOrDefault(sum - k, 0);
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
