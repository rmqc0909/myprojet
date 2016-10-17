package cn.tk.leetcode.addtwonumbers;

import java.util.Arrays;
import java.util.function.Function;

/**
 * Created by xiedan11 on 2016/10/17.
 */
public class WiggleSort {
    public static void main(String[] args) {
        int[] nums = {1, 3, 9, 2, 6, 8, 2, 4, 1, 0};
        Arrays.sort (nums);
        int mid = nums[nums.length / 2];
        int i = 0, j = 0, k = nums.length - 1;
        System.out.println ("sorted: ");
        for (int x:
                nums) {
            System.out.print (x + "  ");
        }
        System.out.println ();
        while (j <= k) {
            //Function<Integer, Integer> Fi = idx -> (2 * i + 1) % (nums.length | 1);
            if (nums[(1+2*(j)) % (nums.length|1)] > mid) {
                swap (nums, nums[(1+2*(j)) % (nums.length|1)], nums[(1+2*(i)) % (nums.length|1)]);
                i++;
                j++;
            }
            else if (nums[(1+2*(j)) % (nums.length|1)] < mid) {
//                swap (nums, nums[(1+2*(j)) % (nums.length|1)], nums[(1+2*(k)) % (nums.length|1)]);
                k--;
            }
            else {
                j++;
            }
        }
        System.out.println ("wiggleSort: ");
        for (int x:
             nums) {
            System.out.print (x + "  ");
        }


    }
    public static void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
