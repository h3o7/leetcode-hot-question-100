package leetcode100.binarytree;

public class Question4 {

    public boolean isSymmetric(TreeNode root) {
        return check(root.left, root.right);


    }
    public boolean check(TreeNode p, TreeNode q) {
        if (p == null || q == null)
            return p == q;
        return (p.val == q.val) && check(p.left, q.right) && check(p.right, q.left);
    }

}
