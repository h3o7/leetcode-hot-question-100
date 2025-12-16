package leetcode100.recall;

import java.util.ArrayList;
import java.util.List;

public class Question4 {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates, target, 0, candidates.length);
        return result;
    }

    public void helper(int[] array, int target, int index, int length) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < length; i++) {
            if (array[i] > target) {
                helper(array, target, i + 1, length);
                return;
            } else {
                list.add(array[i]);
                helper(array, target - array[i], i, length);
                list.remove(list.size() - 1);
            }
        }
    }

}
