package leetcode100.skill;

import java.util.Arrays;

public class Question2 {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

}
