package cn.tk.leetcode;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "asdfg";
		String t = "gfdsa";
		boolean isAnagram1 = isAnagram(s, t);
		boolean isAnagram2 = isAnagram2(s, t);
		System.out.println("返回结果：：" + isAnagram1);
		System.out.println("返回结果：：" + isAnagram2);
	}

	/**
	*
	
	* @param s
	* @param t
	* @return
	
	*/
	private static boolean isAnagram2(String s, String t) {
		if(s.length() != t.length())
		{
			return false;
		}
		char[] str1 = s.toCharArray();
	    char[] str2 = t.toCharArray();
	    Arrays.sort(str1);
	    Arrays.sort(str2);
	    for(char x:str1)
	    {
	    	System.out.println("str1中每个元素：：" + x);
	    }
	    for(char x:str2)
	    {
	    	System.out.println("str2中每个元素：：" + x);
	    }
		return Arrays.equals(str1, str2);
	}

	/**
	*
	
	* @param s
	* @param t
	* @return
	
	*/
	private static boolean isAnagram(String s, String t) {
		byte[] str1 = s.getBytes();
		byte[] str2 = t.getBytes();
		boolean ret = false;
		if(str1.length != str2.length)
		{
			return false;
		}
		for(int i = 0; i < str1.length; i++)
		{
			if(str1[i] != str2[str1.length - 1 - i])
			{
				ret = false;
				break;
			}
			else
				ret = true;
		}
		return ret;
	}

}
