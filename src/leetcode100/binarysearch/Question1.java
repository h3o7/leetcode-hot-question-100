package leetcode100.binarysearch;

public class Question1 {
    public int searchInsert(int[] nums, int target) {
        return helper(nums, target, 0, nums.length - 1);
    }

    public int helper(int[] nums, int target, int left, int right) {
        int mid = (left + right) / 2;
        if (nums[mid] < target) {
            left = mid + 1;
            if (left > right) return left;   // target应该插入到当前位置的后面一个位置
            return helper(nums, target, left, right);
        } else if (nums[mid] > target) {
            right = mid - 1;
            if (right < left) return left;   // target应该插入到当前位置
            return helper(nums, target, left, right);
        }
        return mid;

    }


}
