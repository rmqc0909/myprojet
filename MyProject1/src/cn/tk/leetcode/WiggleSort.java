package cn.tk.leetcode;
/**
 * Created by xiedan11 on 2016/10/18.
 */
public class WiggleSort {
    public static void main(String[] args) {
        int[] nums = {1, 5, 1, 1, 6, 4, 3};
        int size = nums.length;
        int mid;
        KthSmallest kthSmallest = new KthSmallest();
        if (size % 2 == 0) {
            kthSmallest.kthSmallest (nums, 0, size - 1, size / 2);
            mid = nums[size / 2 - 1];
        }
        else {
            kthSmallest.kthSmallest (nums, 0, size - 1, size / 2 + 1);
            mid = nums[size / 2];
        }
        int i = 0, j = 0, k = size - 1;
        System.out.println ("sorted: ");
        for (int x:
                nums) {
            System.out.print (x + "  ");
        }
        System.out.println ();
        System.out.println ("mid element: " + mid);
        //偶数位（对应原来数组的下标范围是[(length/2)--(length-1)]）：放小于中位数的元素    奇数位（对应原来数组的下标范围是[0--(length/2 - 1)]）：放大于中位数的元素
        while (j <= k) {
            if (nums[getAnInt (nums, j)] > mid) {
                kthSmallest.swap (nums, getAnInt (nums, j++), getAnInt (nums, i++));
            }
            else if (nums[getAnInt (nums, j)] < mid) {
                kthSmallest.swap (nums, getAnInt (nums, j), getAnInt (nums, k--));
            }
            else {
                ++j;
            }
        }
        System.out.println ("wiggleSort: ");
        for (int x:
                nums) {
            System.out.print (x + "  ");
        }
    }
    //数组下标映射，当i < nums.length/2，映射到奇数位，当i >= nums.length/2，映射到偶数位
    private static int getAnInt(int[] nums, int i) {
        return (1 + 2 * (i)) % (nums.length | 1);
    }
}
