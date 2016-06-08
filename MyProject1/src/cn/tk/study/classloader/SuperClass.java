/**
 * 
 */
package cn.tk.study.classloader;

/**

 * @ClassName: SuperClass

 * @Description: TODO

 * @author xiedan11

 * @date 2016年6月1日 下午3:38:27

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
