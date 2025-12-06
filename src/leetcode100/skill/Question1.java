package leetcode100.skill;

import java.util.HashSet;
import java.util.Set;

public class Question1 {

    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int result = 0;
        for (int num : nums) {
            if (set.add(num)) {
                result += num;
            } else {
                result -= num;
            }
        }

        return result;
    }

}
