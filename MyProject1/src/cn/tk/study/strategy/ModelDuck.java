/**
 * 
 */
package cn.tk.study.strategy;

/**

 * @ClassName: ModelDuck

 * @Description: TODO

 * @author xiedan11

 * @date 2016年6月6日 下午3:04:46

 *


 */
public class ModelDuck extends Duck {

	/**
	 * 
	 */
	public ModelDuck() {
		// TODO Auto-generated constructor stub
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	/* (non-Javadoc)
	 * @see cn.tk.study.inter.Duck#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
