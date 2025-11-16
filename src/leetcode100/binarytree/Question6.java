package leetcode100.binarytree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Question6 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.addLast(root);
        TreeNode q = root;
        List<Integer> temp = new ArrayList<>();
        while (!deque.isEmpty()) {
            TreeNode first = deque.getFirst();
            if (first.left != null) deque.addLast(first.left);
            if (first.right != null) deque.addLast(first.right);
            temp.add(first.val);
            if (first == q) {
                q = deque.getLast();
                result.add(temp);
                temp = new ArrayList<>();
            }
            deque.pollFirst();
        }
        return result;
    }

}
