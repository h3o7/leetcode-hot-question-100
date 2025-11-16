package leetcode100.binarytree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Question10 {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.addLast(root);
        TreeNode q = root;

        while (!deque.isEmpty()) {
            TreeNode first = deque.getFirst();
            if (first.left != null) deque.addLast(first.left);
            if (first.right != null) deque.addLast(first.right);

            if (first == q) {
                result.add(q.val);
                q = deque.getLast();


            }
            deque.pollFirst();
        }
        return result;
    }

}
