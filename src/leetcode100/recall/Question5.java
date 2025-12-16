package leetcode100.recall;

import java.util.ArrayList;
import java.util.List;

public class Question5 {


    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {

        helper("", n, n, n);
        return result;

    }

    public void helper(String temp, int left, int right, int n) {
        if (temp.length() == 2 * n) {
            result.add(temp);
            return;
        }

        if (left > 0) {
            temp += "(";
            helper(temp, left - 1, right, n);
            temp = temp.substring(0, temp.length() - 1);
        }
        if (right > left) {
            temp += ")";
            helper(temp, left, right - 1, n);
        }

    }

}
