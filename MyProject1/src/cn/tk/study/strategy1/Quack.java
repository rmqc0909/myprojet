/**
 * 
 */
package cn.tk.study.strategy1;

/**

 * @ClassName: Quack

 * @Description:

 * @author xiedan11

 * @date 2016��6��6�� ����1:55:16

 *


 */
public class Quack implements QuackBehavior {

	/* (non-Javadoc)
	 * @see cn.tk.study.inter.QuackBehavior#quack()
	 */
	public void quack() {
		System.out.println("Quack!!!");
	}

}
