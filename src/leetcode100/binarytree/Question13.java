package leetcode100.binarytree;

import java.util.HashMap;
import java.util.Map;

public class Question13 {

    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> map = new HashMap<>();
        long curr = 0;
        map.put(curr, 1);
        return helper(root, targetSum, curr, map);
    }

    public int helper(TreeNode root, int targetSum, long curr, Map<Long, Integer> map) {
        if (root == null) return 0;

        curr += root.val;

        int ret = 0;
        ret += map.getOrDefault(curr - targetSum, 0);
        map.put(curr, map.getOrDefault(curr, 0) + 1);
        ret += helper(root.left, targetSum, curr, map);
        ret += helper(root.right, targetSum, curr, map);
        map.put(curr, map.getOrDefault(curr, 0) - 1);
        return ret;
    }

}
