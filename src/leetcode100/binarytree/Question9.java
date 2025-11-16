package leetcode100.binarytree;

public class Question9 {

    int count = 0;
    int num = 0;

    public int kthSmallest(TreeNode root, int k) {
        inorderTraversal(root, k);
        return num;
    }

    public void inorderTraversal(TreeNode root, int k) {
        if (count >= k || root == null) return;
        inorderTraversal(root.left, k);
        if (count >= k) return;
        count++;
        num = root.val;
        inorderTraversal(root.right, k);

    }

}
