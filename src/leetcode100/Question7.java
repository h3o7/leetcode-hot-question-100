package leetcode100;

import java.util.Arrays;
import java.util.OptionalInt;

public class Question7 {

    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxHeight = Arrays.stream(height).max().getAsInt();
        int areaSum = 0;
        int area = 0;
        for (int h = 0; h < maxHeight; h++) {
            while (left <= right && height[left] <= h) left++;
            while (left <= right && height[right] <= h) right--;
            area = right - left + 1;
            areaSum += area;
        }
        return areaSum;
    }

    public int betterMethod(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxLeft = 0;
        int maxRight = 0;
        int waterTrapped = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    waterTrapped += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    waterTrapped += maxRight - height[right];
                }
                right--;
            }
        }
        return waterTrapped;
    }


}
