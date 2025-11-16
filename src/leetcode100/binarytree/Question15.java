package leetcode100.binarytree;

public class Question15 {

    int result = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        sum(root);
        return result;
    }

    public int sum(TreeNode root) {
        if (root == null) return 0;

        int left = sum(root.left) + root.val;
        int right = sum(root.right) + root.val;
        int max = Math.max(left, right);
        result = Math.max(result, max);
        result = Math.max(result, left + right - root.val);

        return max > 0 ? max : 0;
    }

    
}
