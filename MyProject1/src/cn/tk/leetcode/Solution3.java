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
        int [] params = {-1, 6, 4, 1, 1, 2, 5};
        int maxProfit = maxProfit(params);
        int maxProfit1 = maxProfit1(params);
        int robsum = rob(params);
        int leftCount = removeElement(params, 1);
        System.out.println("maxProfit:::" + maxProfit);
        System.out.println("maxProfit1:::" + maxProfit1);
        System.out.println("robsum:::" + robsum);
        System.out.println("leftCount:::" + leftCount);
    }

    /**
	*Given an array and a value, remove all instances of that value in place and return the new length.
	*Do not allocate extra space for another array, you must do this in place with constant memory.
	*The order of elements can be changed. It doesn't matter what you leave beyond the new length.

	*Example:
	*Given input array nums = [3,2,2,3], val = 3
	*Your function should return length = 2, with the first two elements of nums being 2.
	* @param params
	* @param val
	* @return
	
	*/
	private static int removeElement(int[] params, int val) {
		int i = 0;
		for(int j = 0; j < params.length; j++) {
			if(params[j] != val) {
				params[i] = params[j];
				i++;
			}
		}
		return i;
	}

	/**
	*You are a professional robber planning to rob houses along a street. 
	*Each house has a certain amount of money stashed, 
	*the only constraint stopping you from robbing each of them is that adjacent houses have security system connected 
	*and it will automatically contact the police if two adjacent houses were broken into on the same night.
	*Given a list of non-negative integers representing the amount of money of each house, 
	*determine the maximum amount of money you can rob tonight without alerting the police.
	* @param params
	* @return
	
	*/
	private static int rob(int[] params) {
		for(int x : params) {
			System.out.println("x的值：：：" + x);
			if(x < 0) {
				return -1;	
			}
		}
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0; i < params.length; i++) {
			if(i % 2 == 1) {
				sum1 = sum1 + params[i];
			}
			else {
				sum2 = sum2 + params[i];
			}
		}
		return (sum1 > sum2 ? sum1 : sum2);
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
