/**
 * 
 */
package cn.tk.study.strategy1;

/**

 * @ClassName: FlyNoWay

 * @Description: TODO

 * @author xiedan11

 * @date 2016年6月6日 下午1:54:06

 *


 */
public class FlyNoWay implements FlyBehavior {

	/* (non-Javadoc)
	 * @see cn.tk.study.inter.FlyBehavior#fly()
	 */
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("can't flying");
	}

}
