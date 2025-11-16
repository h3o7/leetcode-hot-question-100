package leetcode100.binarytree;

public class Question7 {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        int mid = nums.length / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(subNums(nums, 0, mid));
        root.right = sortedArrayToBST(subNums(nums, mid + 1, nums.length));
        return root;
    }

    public int[] subNums(int[] nums, int start, int end) {
        int[] newNums = new int[end - start];
        for (int i = start; i < end; i++) {
            newNums[i - start] = nums[i];
        }
        return newNums;
    }

}
