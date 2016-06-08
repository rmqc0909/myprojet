/**
 * 
 */
package cn.tk.study.strategy;

/**

 * @ClassName: MallardDuck

 * @Description: TODO

 * @author xiedan11

 * @date 2016年6月6日 下午1:59:07

 *


 */
public class MallardDuck extends Duck {

	/**
	 * 
	 */
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	/* (non-Javadoc)
	 * @see cn.tk.study.inter.Duck#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("real Mallard duck!!!");
	}

}
