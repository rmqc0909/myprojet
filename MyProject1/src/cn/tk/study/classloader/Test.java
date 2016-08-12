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
	        StaticTest st1 = new StaticTest();
	        StaticTest st2 = new StaticTest();
	    	System.out.println("st1:" + st1.i + ",st2:" + st2.i);
	    	System.out.println("st1静态的 hashCode():" + st1.i.hashCode() + ",st2静态的 hashCode():" + st2.i.hashCode());
	    	System.out.println("st1的 hashCode():" + st1.j.hashCode() + ",st2的 hashCode():" + st2.j.hashCode());
	    	
	    }
	    
}
