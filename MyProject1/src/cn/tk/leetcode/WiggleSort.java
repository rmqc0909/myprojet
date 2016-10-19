package cn.tk.leetcode;
/**
 * Created by xiedan11 on 2016/10/18.
 */
public class WiggleSort {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 3, 1};
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
        //ż��λ����Ӧԭ��������±귶Χ��[(length/2)--(length-1)]������С����λ����Ԫ��    ����λ����Ӧԭ��������±귶Χ��[0--(length/2 - 1)]�����Ŵ�����λ����Ԫ��
        //getAnInt (nums, i)�����۵��±꣬getAnInt (nums, j)��ǰ�±꣬getAnInt (nums, k)ż���۵��±�
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
    //�����±�ӳ�䣬��i < nums.length/2��ӳ�䵽����λ����i >= nums.length/2��ӳ�䵽ż��λ
    private static int getAnInt(int[] nums, int i) {
        return (1 + 2 * (i)) % (nums.length | 1);
    }
}
