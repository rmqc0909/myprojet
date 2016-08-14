package cn.tk.leetcode;

/**
 * Created by xiedan on 16/8/14.
 *
 * Say you have an array for which the ith element is the price of a given stock on day i.

 If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

 Example 1:
 Input: [7, 1, 5, 3, 6, 4]
 Output: 5

 max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
 Example 2:
 Input: [7, 6, 4, 3, 1]
 Output: 0

 In this case, no transaction is done, i.e. max profit = 0.

 */
public class Solution3 {
    public static void main(String args[]){
        int [] prices = {1, 6, 4, 3, 1};
        int maxProfit = maxProfit(prices);
        int maxProfit1 = maxProfit1(prices);
        System.out.println("maxProfit:::" + maxProfit);
        System.out.println("maxProfit1:::" + maxProfit1);
    }

    /**
     * 时间复杂度: O(n)   空间复杂度: O(1)
     * @param prices
     * @return
     */
    private static int maxProfit1(int[] prices) {
        int maxprofit = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < min)
                min = prices[i];
            else if (prices[i] - min > maxprofit)
                maxprofit = prices[i] - min;
        }
        return maxprofit;
    }


    /**
     * 该算法时间复杂度: O(n^2) 空间复杂度: O(1)
     * @param prices
     * @return
     */
    private static int maxProfit(int[] prices) {
        int max = 0;
        for(int i = 0; i < prices.length; i++){
            for (int j = i + 1; j < prices.length; j++) {
                if(prices[j] > prices[i]){
                    int tmp = prices[j] - prices[i];
                    if(tmp > max){
                        max = tmp;
                    }
                }

            }
        }
        return max;
    }
}
