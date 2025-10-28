package leetcode100.binary.tree;

public class Question2 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int numLeft = maxDepth(root.left);
        int numRight = maxDepth(root.right);
        return numLeft > numRight ? (numLeft + 1) : (numRight + 1);

    }
}
