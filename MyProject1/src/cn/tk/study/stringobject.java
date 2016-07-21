/**
 * 
 */
package cn.tk.study;

/**

 * @ClassName: stringobject

 * @Description: TODO

 * @author xiedan11

 * @date 2016年7月15日 上午11:14:23

 *


 */
public class stringobject {

public static void main(String[] args) {
	String s0 = "kill";
	String s1 = new String("kill");
	String s2 = "ki" + new String("ll");
	System.out.println("s0=s1" + s0==s1);
	System.out.println("s0=s1" + s1==s2);
	System.out.println("s0=s1" + s0==s2);
	
	
	System.out.println("转换后的16进制对应的10进制数为：：" + Integer.valueOf("24924925",16).toString());
	System.out.println("转换后的16进制对应的10进制数为111：：" + Integer.valueOf("12",16).toString());
	
	
	String ss0 = "kiill";
	String ss1 = "kiill";
	String ss2 = "kii" + "ll";
	System.out.println("ss0=ss1" + ss0==ss1);
	System.out.println("ss0=ss1" + ss1==ss2);
	System.out.println("ss0=ss1" + ss0==ss2);
}

}
