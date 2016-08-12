/**
 * 
 */
package cn.tk.study;

import java.io.UnsupportedEncodingException;

/**

 * @ClassName: stringobject

 * @Description: TODO

 * @author xiedan11

 * @date 2016年7月15日 上午11:14:23

 *


 */

class Dog 
{
	String name;
	String says;

	public Dog(String name, String says)
	{
		this.name = name;
		this.says = says;
	}

	/**
	 * 
	 */
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
}
public class stringobject {
	
public static void main(String[] args) {
	   String a = "101";
	   String b = "1101";
	   String[] arr1 = new String[a.length()];
	   String[] arr2 = new String[b.length()];
	   for(int i = 0; i < arr1.length; i++)
	   {
		   arr1[i] = a.substring(i, i+1);
	   }
	   
	   for(int i = 0; i < arr2.length; i++)
	   {
		   arr2[i] = b.substring(i, i+1);
	   }
	   for(String x: arr1)
	   {
		   System.out.println("数组1中的元素值：：" + x);
	   }
	   for(String x: arr2)
	   {
		   System.out.println("数组2中的元素值：：" + x);
	   }
		   
	   for(int i = 0; i < b.length(); i++)  
	   {
		  
	   }
	        
	
	
	
	
}

}
