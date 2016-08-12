/**
 * 
 */
package cn.tk.study.classloader;

/**

 * @ClassName: StaticTest

 * @Description: TODO 测试加载顺序
 * 类的生命周期是：加载->验证->准备->解析->初始化->使用->卸载，只有在准备阶段和初始化阶段才会涉及类变量的初始化和赋值。
 * 
 * 
 * 类的准备阶段需要做是为类变量（有static修饰的变量）分配内存并设置默认值，因此类变量st为null、c为0；
 * 需要注意的是如果类变量是final，编译时javac将会为value生成ConstantValue属性，在准备阶段虚拟机就会根据ConstantValue的设置将变量设置为指定的值，
 * 比如：static final int b=112,在准备阶段b的值就是112。 
 * 
 * 
 * 类的初始化阶段需要做是执行类构造器（类构造器是编译器收集所有静态语句块和类变量的赋值语句按语句在源码中的顺序合并生成类构造器，
 * 对象的构造方法是<init>()，类的构造方法是<clinit>()，可以在堆栈信息中看到），
 * 因此先执行第一条静态变量的赋值语句即st = new StaticTest ()，此时会进行对象的初始化，对象的初始化是先初始化成员变量再执行构造方法
 * 
 * 顺序为：设置a为110->打印2->执行构造方法(打印3,此时a已经赋值为110，但是c只是设置了默认值0，并未完成赋值动作，b的默认值112。)
 * 
 * 于是出现了“实例初始化竟然出现在静态初始化之前”
 * 
 * 
 * 
 * 
 * 
 * 总结如下：：：
 * 1.首先在执行此段代码时，首先由main方法的调用触发静态初始化。
 * 2.在初始化Test 类的静态部分时，遇到st这个成员。
 * 3.但凑巧这个变量引用的是本类的实例。
 * 4.在实例化st变量时，实际上是把实例初始化嵌入到了静态初始化流程中，并且嵌入到了静态初始化的起始位置。
 * 这就导致了实例初始化完全至于静态初始化之前。这也是导致a有值c没值的原因。

 * @author xiedan11

 * @date 2016年6月2日 下午2:18:21

 *


 */
public class StaticTest {

	static String i = "14";
	String j = "30";
	public static void main(String[] args)
    {
        staticFunction();
    }

    static StaticTest st = new StaticTest();

    static
    {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    StaticTest()
    {
        System.out.println("3");
        System.out.println("a="+a+",b="+b+",c="+c);
    }

    public static void staticFunction(){
        System.out.println("4");
    }
    int a=110;
    static final int b =112;
    static int c =115;
}
