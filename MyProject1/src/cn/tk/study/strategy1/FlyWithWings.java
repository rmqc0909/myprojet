/**
 * 
 */
package cn.tk.study.strategy1;

/**

 * @ClassName: FlyWithWings

 * @Description: TODO

 * @author xiedan11

 * @date 2016年6月6日 下午1:53:00

 *


 */
public class FlyWithWings implements FlyBehavior {

	/* (non-Javadoc)
	 * @see cn.tk.study.inter.FlyBehavior#fly()
	 */
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("flying!!!");
	}

}
