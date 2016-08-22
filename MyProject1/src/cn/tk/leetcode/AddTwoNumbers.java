package cn.tk.leetcode;

/**
 * Created by xiedan on 16/8/22.
 *
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 */

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // call the recursion
        return addLists(l1,l2,0);
    }

    private ListNode addLists(ListNode l1, ListNode l2, int carry) {
        if(l1 == null && l2 == null && carry == 0) return null;
        int digit = carry;
        digit += (l1 != null) ? l1.val : 0;
        digit += (l2 != null) ? l2.val : 0;
        carry = digit / 10;     //进位
        digit = digit % 10;     //本位
        ListNode head = new ListNode(digit);
        head.next = addLists((l1 != null) ? l1.next : null, (l2 != null) ? l2.next : null, carry);
        return head;
    }

}
