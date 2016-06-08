/**
 * 
 */
package cn.tk.study.strategy;

/**

 * @ClassName: Duck

 * @Description: TODO

 * @author xiedan11

 * @date 2016年6月6日 下午1:36:13

 *


 */
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	/**
	 * @param flyBehavior the flyBehavior to set
	 */
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	/**
	 * @param quackBehavior the quackBehavior to set
	 */
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	public Duck() {
	}
	public abstract void display();
	public void performFLy(){
		flyBehavior.fly();
	}
	public void performQuack(){
		quackBehavior.quack();
	}
}
