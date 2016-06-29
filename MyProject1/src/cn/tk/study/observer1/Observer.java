/**
 * 
 */
package cn.tk.study.observer1;

/**

 * @ClassName: Observer

 * @Description: TODO

 * @author xiedan11

 * @date 2016年6月28日 上午10:56:24

 *


 */
public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
