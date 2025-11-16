package leetcode100.binarytree;

import java.util.HashMap;
import java.util.Map;

public class Question14 {


    Map<TreeNode, TreeNode> map = new HashMap<>();
    Map<TreeNode, Boolean> node = new HashMap<>();

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        map.put(root, null);
        preorder(root);

        while (map.get(p) != null) {
            node.put(p, true);
            p = map.get(p);
        }
        node.put(p, true);
        while (map.get(q) != null) {
            if (node.get(q) == true) {
                return q;
            }
            q = map.get(q);
        }
        return q;
    }

    public void preorder(TreeNode root) {
        if (root == null) return;
        map.put(root.left, root);
        map.put(root.right, root);
        node.put(root, false);
        preorder(root.left);
        preorder(root.right);
    }

}
