package leetcode100.binarytree;

public class Question11 {
    public void flatten(TreeNode root) {
        if (root == null) return;
        TreeNode right = root.right;

        flatten(root.left);
        root.right = root.left;
        root.left = null;
        flatten(right);

        TreeNode q = root;
        while (q.right != null) q = q.right;
        q.right = right;

    }

}
