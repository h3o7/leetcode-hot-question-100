package leetcode100.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class Question1 {

    public int LengthOfLongestSubstring(String s){
        Map<Character,Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxLength = 0;
        while(right < s.length()){
            Integer index = map.put(s.charAt(right), right++);
            if(index == null) continue;
            maxLength = Math.max(maxLength, right - left - 1);
            if(index >= left){
                left = index + 1;
                }
        }
        maxLength = Math.max(maxLength, right - left);
        return maxLength;
    }
}
