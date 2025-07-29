package leetcode100;

public class Question5 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = (right - left) * Math.min(height[left], height[right]);
        while (left < right) {
            if (height[left] < height[right]) {
                left++;
                int temp = (right - left) * Math.min(height[left], height[right]);
                max = max > temp ? max : temp;
            } else {
                right--;
                int temp = (right - left) * Math.min(height[left], height[right]);
                max = max > temp ? max : temp;
            }
        }
        return max;
    }
}
