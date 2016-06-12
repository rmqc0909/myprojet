/**
 * 
 */
package cn.tk.study.strategy1;

/**

 * @ClassName: MiniDucksSimulator

 * @Description: TODO

 * @author xiedan11

 * @date 2016年6月6日 下午1:57:21

 *


 */
public class MiniDucksSimulator {

	/**
	 *
	
	 * @param args
	
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		mallard.performFLy();
		mallard.performQuack();
		mallard.setFlyBehavior(new FlyRocketPowered());
		mallard.performFLy();
		Duck model = new ModelDuck();
		model.performFLy();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFLy();
	}

}
