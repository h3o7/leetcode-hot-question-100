package leetcode100;

import java.util.Arrays;

public class Question15 {
    public void rotate(int[] nums, int k) {
        int newK = k % nums.length;
        int[] newNums = Arrays.copyOf(nums, nums.length);
        for (int i = 0; i < nums.length; i++) {
            nums[(k + i) % nums.length] = newNums[i];
        }
    }
    
}
