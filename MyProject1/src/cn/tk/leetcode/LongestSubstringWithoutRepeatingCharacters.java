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
		int lengthOfLongestSubstring = lengthOfLongestSubstring("abdds");
		System.out.println("lengthOfLongestSubstring: " + lengthOfLongestSubstring);
	}
	public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Set repeatCharacter_hashset = new HashSet();
        for(int i = 0; i < s.length(); i++) {
        	repeatCharacter_hashset.add(s.charAt(i));
        	for(int j = i + 1; j < s.length(); j++) {
        		while(!repeatCharacter_hashset.contains(s.charAt(j))) {
        			repeatCharacter_hashset.add(s.charAt(j));
        		}
        		break;
        	}
        	if(repeatCharacter_hashset.size() > maxLength) 
        		maxLength = repeatCharacter_hashset.size();
        }
        
        return maxLength;
        
        
    }

}
