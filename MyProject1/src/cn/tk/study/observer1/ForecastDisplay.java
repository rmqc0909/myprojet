/**
 * 
 */
package cn.tk.study.observer1;

/**

 * @ClassName: ForecastDisplay

 * @Description: TODO

 * @author xiedan11

 * @date 2016年6月28日 下午3:03:58

 *


 */
public class ForecastDisplay implements DisplayElement, Observer {
	private float humidity;
	private float temperature;
	private Subject weatherData;
	/**
	 * 
	 */
	public ForecastDisplay(Subject weatherData) {
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
		System.out.println("预报temperature:" + temperature + ",humidity:" + humidity);
	}

}
