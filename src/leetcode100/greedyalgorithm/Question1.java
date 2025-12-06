package leetcode100.greedyalgorithm;

public class Question1 {
    public static void main(String[] args) {
        int[] prices = {2, 1, 2, 1, 0, 1, 2};
        System.out.println(maxProfit(prices));
    }


    public static int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        int profit = 0;
        int buy = Integer.MAX_VALUE;
        for (int num : prices) {
            if (num < buy) {
                buy = num;
            } else {
                int temp = num - buy;
                profit = Math.max(temp, profit);
            }
        }
        return profit;

    }

}
