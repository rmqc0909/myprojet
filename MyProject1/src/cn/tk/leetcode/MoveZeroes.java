package cn.tk.leetcode;

/**
 * 

* @ClassName: MoveZeroes

* @Description: 给定一个int型数组，将数组中的0移到数组的末尾，例如nums = [0, 1, 0, 3, 12],处理后应为：[1, 3, 12, 0, 0].

* @author xiedan11

* @date 2016年8月10日 下午2:43:28

*
 */
public class MoveZeroes {

	public static void main(String[] args) {
		MoveZeroes moveZeroes = new MoveZeroes();
		int[] nums = {0,2,3,0,6,8};
		//moveZeroes.moveZeroes1(nums);
		moveZeroes.moveZeroes2(nums);
		
	}
	
	/**
	 * 
	*
	方法2
	* @param nums
	 */
	public void moveZeroes2(int[]nums)
	{
		int length = nums.length;
		int lastNonZeroFoundAt = 0;
		for(int i = 0; i < length; i++)
		{
			if(nums[i] != 0)
			{
				nums[lastNonZeroFoundAt++] = nums[i];	//先给lastNonZeroFoundAt下标数组赋值，然后lastNonZeroFoundAt再加1
				
				//nums[++lastNonZeroFoundAt] = nums[i];		//lastNonZeroFoundAt下标先加1，然后给lastNonZeroFoundAt下标赋值
			}
		}
		for(int i = lastNonZeroFoundAt; i < length; i++)
		{
			nums[i] = 0;
		}
		for(int x : nums)
		{
			System.out.println("处理后的数组元素：" + x);
		}
	}
	/**
	 * 
	*
	方法1
	* @param nums
	 */
	public void moveZeroes1(int[] nums)
	{
		int length = nums.length;
		int numZeroes = 0;
		int i = 0;
		int[] ans = new int[length];
		
		for(int x: nums)
		{
			System.out.println("数组中的每一个元素：：" + x);
			if(x == 0)
			numZeroes++;
		}
		System.out.println("数组中的0的个数：：" + numZeroes);
		
		
		while(i < length - numZeroes)
		{
			for(int j = 0; j < length; j++)
			{
				if(nums[j] != 0 )
				{
					ans[i] = nums[j];
					i++;
				}
			}
		}
		
		while(numZeroes > 0)
		{
			ans[i] = 0;
			i++;
			numZeroes--;
		}
		
		for(int k = 0; k < length; k++)
		{
			nums[k] = ans[k];
		}
		
		for(int x: nums)
		{
			System.out.println("处理后的数组中的每一个元素：：" + x);
		}
	}

}