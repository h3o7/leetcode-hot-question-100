package leetcode100;

import java.util.HashMap;

public class Question1 {

    public int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            Integer index = map.get(num);
            if(index != null){
                result[0] = i;
                result[1] = index;
                break;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}
