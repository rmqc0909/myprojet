/**
 * 
 */
package cn.tk.study.strategy1;

/**

 * @ClassName: MuteQuack

 * @Description: TODO

 * @author xiedan11

 * @date 2016��6��6�� ����1:56:00

 *


 */
public class MuteQuack implements QuackBehavior {

	/* (non-Javadoc)
	 * @see cn.tk.study.inter.QuackBehavior#quack()
	 */
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Silence!!!");
	}

}
