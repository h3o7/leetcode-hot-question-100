package leetcode100.doublepointer;

public class Question2 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = (right - left) * Math.min(height[left], height[right]);
        while (left < right) {
            if (height[left] < height[right]) {
                left++;
                int temp = (right - left) * Math.min(height[left], height[right]);
                max = Math.max(max, temp);
            } else {
                right--;
                int temp = (right - left) * Math.min(height[left], height[right]);
                max = Math.max(max, temp);
            }
        }
        return max;
    }
}
