/**
 * 
 */
package cn.tk.study.observer1;


/**

 * @ClassName: Subject

 * @Description: TODO

 * @author xiedan11

 * @date 2016��6��28�� ����10:42:36

 *


 */
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
