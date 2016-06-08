/**
 * 
 */
package cn.tk.study.strategy;

/**

 * @ClassName: Squeak

 * @Description: TODO

 * @author xiedan11

 * @date 2016年6月6日 下午1:56:37

 *


 */
public class Squeak implements QuackBehavior {

	/* (non-Javadoc)
	 * @see cn.tk.study.inter.QuackBehavior#quack()
	 */
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Squeak!!!");
	}

}
