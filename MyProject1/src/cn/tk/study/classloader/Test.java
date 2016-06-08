/**
 * 
 */
package cn.tk.study.classloader;

/**

 * @ClassName: Test

 * @Description: TODO

 * @author xiedan11

 * @date 2016年6月1日 下午5:45:23

 *


 */
public class Test {
	 static
	    {
	        i=2;
	        //System.out.println(i);//这句编译器会报错：Cannot reference a field before it is defined（非法向前应用）
	    }
	    static int i;
	    public static void main(String args[])
	    {
	        System.out.println(i);
	    }
	    
}
