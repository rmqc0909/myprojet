/**
 * 
 */
package cn.tk.study.classloader;

/**

 * @ClassName: Test

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
	        System.out.println(i);
	    }
	    
}
