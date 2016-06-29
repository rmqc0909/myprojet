/**
 * 
 */
package cn.tk.study.observer1;

/**

 * @ClassName: StatisticsDisplay

 * @Description: TODO

 * @author xiedan11

 * @date 2016年6月28日 下午2:40:56

 *


 */
public class StatisticsDisplay implements DisplayElement, Observer {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	/**
	 * 
	 */
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	/* (non-Javadoc)
	 * @see cn.tk.study.observer.Observer#update(float, float, float)
	 */
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

	/* (non-Javadoc)
	 * @see cn.tk.study.observer.DisplayElement#display()
	 */
	@Override
	public void display() {
		System.out.println("数据统计temperature:" + temperature + ",humidity:" + humidity);
	}

}
