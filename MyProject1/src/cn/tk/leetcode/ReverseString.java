package cn.tk.leetcode;

/**
 * 

* @ClassName: ReverseString

* @Description: 反转字符串

* @author xiedan11

* @date 2016年8月10日 上午11:04:12

*
 */
public class ReverseString {

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		reverseString.reverse("hell0!");
	}
	
	public String reverse(String str)
	{
		System.out.println("反转前的字符串值：：" + str);
		int length = str.length();
		byte[] arr1 = str.getBytes();
		byte[] arr2 = new byte[length];
		System.out.println("数字中的长度:" + length);
		for(byte x: arr1)
		{
			System.out.println("数组1中的元素值：：" + x);
		}
		for(int i = 0; i < length; i++)
		{
			arr2[length -1 - i] = arr1[i];
		}
		for(byte x: arr2)
		{
			System.out.println("数组2中的元素值：：" + x);
		}
		String res = new String(arr2);
		System.out.println("反转后的字符串值：：" + res);
		return res;
	}
}
