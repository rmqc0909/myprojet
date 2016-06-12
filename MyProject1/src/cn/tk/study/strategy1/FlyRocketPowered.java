/**
 * 
 */
package cn.tk.study.strategy1;

/**

 * @ClassName: FlyRocketPowered

 * @Description: TODO

 * @author xiedan11

 * @date 2016年6月6日 下午2:27:10

 *


 */
public class FlyRocketPowered implements FlyBehavior {

	/**
	 * 
	 */
	public FlyRocketPowered() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see cn.tk.study.inter.FlyBehavior#fly()
	 */
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("flying with a rocket!!!");
	}

}
