/**
 * 
 */
package cn.tk.study.strategy;

/**

 * @ClassName: Quack

 * @Description: TODO

 * @author xiedan11

 * @date 2016��6��6�� ����1:55:16

 *


 */
public class Quack implements QuackBehavior {

	/* (non-Javadoc)
	 * @see cn.tk.study.inter.QuackBehavior#quack()
	 */
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Quack!!!");
	}

}
