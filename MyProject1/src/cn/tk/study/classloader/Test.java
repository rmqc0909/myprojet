/**
 * 
 */
package cn.tk.study.classloader;

/**

 * @ClassName: TestA

 * @Description: TODO

 * @author xiedan11

 * @date 2016��6��1�� ����5:45:23

 *


 */
public class Test {
	 static
	    {
	        i=2;
	        //System.out.println(i);//���������ᱨ��Cannot reference a field before it is defined���Ƿ���ǰӦ�ã�
	    }
	    static int i;
	    public static void main(String args[])
	    {
	        StaticTest st1 = new StaticTest();
	        StaticTest st2 = new StaticTest();
	    	System.out.println("st1:" + st1.i + ",st2:" + st2.i);
	    	System.out.println("st1��̬�� hashCode():" + st1.i.hashCode() + ",st2��̬�� hashCode():" + st2.i.hashCode());
	    	System.out.println("st1�� hashCode():" + st1.j.hashCode() + ",st2�� hashCode():" + st2.j.hashCode());
	    	
	    }
	    
}
