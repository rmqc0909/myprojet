package cn.tk.leetcode;

/**
 * Created by xiedan11 on 2016/9/13.
 */
public class ReverseInteger {
    public static void main(String args[]) {
        int reverse = reverse(1234056789);
        System.out.println("reversed value: " + reverse);
    }

    /**
     * Reverse digits of an integer.
     Example1: x = 123, return 321
     Example2: x = -123, return -321
     * @param x
     * @return
     */
    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10 ;
            int newResult = result * 10 + tail;
            //Whether there is overflow,If overflow exists, the new result will not equal previous one.
            if ((newResult - tail) / 10 != result) {
                return 0;
            }
            result = newResult;
            x = x / 10;
        }
        return result;
    }
}
