package leetcode100.ordinaryarray;

import java.util.Arrays;

public class Question3 {
    public void rotate(int[] nums, int k) {
        int newK = k % nums.length;
        int[] newNums = Arrays.copyOf(nums, nums.length);
        for (int i = 0; i < nums.length; i++) {
            nums[(k + i) % nums.length] = newNums[i];
        }
    }
    
}
