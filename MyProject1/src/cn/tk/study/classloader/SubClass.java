/**
 * 
 */
package cn.tk.study.classloader;

/**

 * @ClassName: SubClass

 * @Description: TODO

 * @author xiedan11

 * @date 2016��6��1�� ����3:40:29

 *


 */
public class SubClass extends SuperClass {
	static 
    {
        System.out.println("SubClass init");
    }

	static int a;

    public SubClass()
    {
        System.out.println("init SubClass");
    }
}
