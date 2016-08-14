package cn.tk.leetcode;

/**
 * Created by xiedan on 16/8/14.
 */
public class Solution3 {
    public static void main(String args[]){
        int [] prices = {7, 6, 4, 3, 1};
        int maxProfit = maxProfit(prices);
        System.out.println("maxProfit:::" + maxProfit);
    }

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
