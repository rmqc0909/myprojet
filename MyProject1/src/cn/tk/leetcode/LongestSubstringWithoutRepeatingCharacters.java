/**
 * 
 */
package cn.tk.leetcode;

import java.util.HashSet;
import java.util.Set;

/**

 * @ClassName: LongestSubstringWithoutRepeatingCharacters

 * @Description: TODO

 * @author xiedan11

 * @date 2016年8月25日 下午5:48:57

 *


 */
public class LongestSubstringWithoutRepeatingCharacters {

	/**
	 *
	
	 * @param args
	
	 */
	public static void main(String[] args) {
		int lengthOfLongestSubstring = lengthOfLongestSubstring("a");
		System.out.println("lengthOfLongestSubstring: " + lengthOfLongestSubstring);
	}
	public static int lengthOfLongestSubstring(String s) {
		if(s.length() == 1) return 1;
        int maxLength = 0;
        for(int i = 0; i < s.length() - 1; i++) {
			Set repeatCharacter_hashset = new HashSet();
        	repeatCharacter_hashset.add(s.charAt(i));
			int j = i + 1;
			while (j < s.length() && !repeatCharacter_hashset.contains(s.charAt(j))) {
				repeatCharacter_hashset.add(s.charAt(j));
				j++;
			}
        	if(repeatCharacter_hashset.size() > maxLength) 
        		maxLength = repeatCharacter_hashset.size();
        }
        return maxLength;
        
        
    }

}
