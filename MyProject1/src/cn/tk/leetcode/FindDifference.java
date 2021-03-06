package cn.tk.leetcode;

/**
 * Created by xiedan on 16/9/15.
 */
public class FindDifference {
    /**
     *
     * Given two strings s and t which consist of only lowercase letters.

     String t is generated by random shuffling string s and then add one more letter at a random position.

     Find the letter that was added in t.

     Input:
     s = "abcd"
     t = "abcde"

     Output:
     e

     Explanation:
     'e' is the letter that was added.
     * @param s
     * @param t
     * @return
     */
    public static char findTheDifference(String s, String t) {
        if(s == null && t == null) return ' ';
        byte sByte[] = s.getBytes();
        byte tByte[] = t.getBytes();
        byte tmp = 0;
        for (byte x: sByte
             ) {
            tmp ^= x;
        }
        for (byte x: tByte
             ) {
            tmp ^= x;
        }
        return (char)tmp;
    }
    public static void main(String args[]) {
        char ret = findTheDifference("aaaaaaa", "aaaaaa");
        System.out.println(ret);
    }
}
