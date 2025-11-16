package leetcode100.substring;

import java.util.*;

public class Question3 {
    public static void main(String[] args) {


    }

    public static String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";
        Map<Character, Integer> mapT = new HashMap<>();  // 记录字符串t
        for (int i = 0; i < t.length(); i++) {
            mapT.merge(t.charAt(i), 1, (oldValue, newValue) -> oldValue + newValue);
        }
        int needCount = 0;
        int left = 0, bestL = -1, bestLen = Integer.MAX_VALUE;


        // 扫描字符串s
        for (int i = 0; i < s.length(); i++) {
            Character key = s.charAt(i);
            if (mapT.containsKey(key)) {
                mapT.put(key, mapT.get(key) - 1);
                if (mapT.get(key) >= 0) needCount++;
            }

            // 当窗口包含了字符串t的所有字符时，尝试缩小窗口
            while(needCount == t.length()){
                if(i - left + 1 < bestLen){
                    bestLen = i - left + 1;
                    bestL = left;
                }
                Character newKey = s.charAt(left);
                if(mapT.containsKey(newKey)){
                    mapT.put(newKey,mapT.get(newKey) + 1);
                    if(mapT.get(newKey) > 0) needCount--;
                }
                left++;

            }
        }
        return bestL == -1 ? "" : s.substring(bestL, bestL + bestLen);
    }

}
