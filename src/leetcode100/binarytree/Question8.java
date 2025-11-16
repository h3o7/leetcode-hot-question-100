package leetcode100.binarytree;

public class Question8 {
    long max = Long.MIN_VALUE;
    boolean result = true;

    public boolean isValidBST(TreeNode root) {
        helper(root);
        return result;
    }

    public void helper(TreeNode root) {
        if (root == null) return;
        helper(root.left);
        if (root.val <= max) {
            result = false;
            return;
        }
        max = root.val;
        helper(root.right);
    }

}
