package leetcode100.recall;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question3 {


    Map<Character, String> data = new HashMap<>();
    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return result;
        data.put('2', "abc");
        data.put('3', "def");
        data.put('4', "ghi");
        data.put('5', "jkl");
        data.put('6', "mno");
        data.put('7', "pqrs");
        data.put('8', "tuv");
        data.put('9', "wxyz");
        helper(digits, 0, "");
        return result;

    }

    public void helper(String digits, int index, String str) {
        if (str.length() == digits.length()) {
            result.add(str);
            return;
        }
        int n = data.get(digits.charAt(index)).length();
        for (int i = 0; i < n; i++) {
            String newStr = str + data.get(digits.charAt(index)).charAt(i);
            helper(digits, (index + 1), newStr);
        }
    }

}
