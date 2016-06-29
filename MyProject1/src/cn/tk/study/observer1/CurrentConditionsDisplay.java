/**
 * 
 */
package cn.tk.study.observer1;

/**

 * @ClassName: CurrentConditionsDisplay

 * @Description: TODO

 * @author xiedan11

 * @date 2016年6月28日 上午11:29:50

 *


 */
public class CurrentConditionsDisplay implements DisplayElement, Observer {

	private Subject weatherData;
	private float humidity;
	private float temperature;
	
	/**
	 * 
	 */
	public CurrentConditionsDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	/* (non-Javadoc)
	 * @see cn.tk.study.observer.Observer#update(float, float, float)
	 */
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

	/* (non-Javadoc)
	 * @see cn.tk.study.observer.DisplayElement#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}

}
