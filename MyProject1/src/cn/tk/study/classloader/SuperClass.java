/**
 * 
 */
package cn.tk.study.classloader;

/**

 * @ClassName: SuperClass

 * @Description: TODO

 * @author xiedan11

 * @date 2016��6��1�� ����3:38:27

 *


 */
public class SuperClass extends SSClass
{
    static
    {
        System.out.println("SuperClass init!");
    }

    public static int value = 123;

    public SuperClass()
    {
        System.out.println("init SuperClass");
    }
}
