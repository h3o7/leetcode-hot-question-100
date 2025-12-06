package leetcode100.dynamicprogramming;

public class Question1 {

    // 动态规划
    public int climbStairsByDynamic(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int[] nums = new int[n];
        nums[0] = 1;
        nums[1] = 2;

        for (int i = 2; i < n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n - 1];
    }


    // 递归
    public int climbStairsByRecursion(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return climbStairsByRecursion(n - 1) + climbStairsByRecursion(n - 2);
    }

}
