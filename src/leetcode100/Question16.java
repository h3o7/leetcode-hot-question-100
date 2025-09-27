package leetcode100;

public class Question16 {
    public static void main(String[] args) {

    }
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int pre = 1;
        int suf = 1;
        int[] arrPre = new int[n];
        int[] arrSuf = new int[n];
        int[] result = new int[n];
        // 计算前缀和
        for (int i = 0; i < n; i++) {
            arrPre[i] = pre;
            pre *= nums[i];
            arrSuf[n - 1 - i] = suf;
            suf *= nums[n - 1 - i];
        }
        for (int i = 0; i < n; i++) result[i] = arrPre[i] * arrSuf[i];
        return result;
    }

}
