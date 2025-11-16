package leetcode100.ordinaryarray;

public class Question1 {
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int temp = nums[0];          // 记录当前子数组的值
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            if (temp < 0) {
                result = Math.max(result, temp);
                temp = nums[i];
                continue;
            }
            int sum = temp + nums[i];
            if (sum < temp) {
                result = Math.max(result, temp);
            }
            temp = sum;
        }
        result = Math.max(result, temp);
        return result;
    }
}
