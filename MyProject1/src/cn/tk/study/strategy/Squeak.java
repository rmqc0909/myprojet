/**
 * 
 */
package cn.tk.study.strategy;

/**

 * @ClassName: Squeak

 * @Description: TODO

 * @author xiedan11

 * @date 2016��6��6�� ����1:56:37

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
