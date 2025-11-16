package leetcode100.substring;

import java.util.*;

public class Question2 {

    // 239. 滑动窗口最大值 双端队列记录窗口中的值
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i - flag == k) {
                deque.poll();
                for (int j = flag + 1; j < i; j++) {
                    if (deque.isEmpty()) break;
                    if (deque.peek() == nums[j])
                        flag = j;
                }
            }
            // 添加新元素
            if (deque.isEmpty()) {
                deque.addFirst(nums[i]);
                flag = i;
            } else {
                while (!deque.isEmpty() && nums[i] >= deque.peekLast()) deque.pollLast();
                if (deque.isEmpty()) flag = i;
                deque.addLast(nums[i]);
            }
            // 记录答案
            if (i - k + 1 >= 0)
                result[i - k + 1] = deque.peekFirst();
        }
        return result;
    }

    // 记录最大值的下标
    public int[] betterMethod(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            // 移除不在窗口内的元素
            if (!deque.isEmpty() && i - deque.peek() == k) {
                deque.poll();
            }
            // 添加新元素
            if (deque.isEmpty()) {
                deque.addFirst(i);
            } else {
                while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) deque.pollLast();
                deque.addLast(i);
            }
            // 记录答案
            if (i - k + 1 >= 0 && !deque.isEmpty())
                result[i - k + 1] = nums[deque.peekFirst()];
        }
        return result;
    }

}
