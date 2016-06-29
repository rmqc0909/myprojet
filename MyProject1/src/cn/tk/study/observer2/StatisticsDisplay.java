/**
 * 
 */
package cn.tk.study.observer2;

import java.util.Observable;
import java.util.Observer;

/**

 * @ClassName: StatisticsDisplay

 * @Description: TODO

 * @author xiedan11

 * @date 2016年6月29日 下午2:31:41

 *


 */
public class StatisticsDisplay implements DisplayElement, Observer {
	
	Observable observable;
	private float temperature;
	private float humidity;
	/**
	 * 
	 */
	public StatisticsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherData)
		{
			WeatherData weatherData = (WeatherData) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

	/* (non-Javadoc)
	 * @see cn.tk.study.observer2.DisplayElement#display()
	 */
	@Override
	public void display() {
		System.out.println("数据统计temperature:" + temperature + ",humidity:" + humidity);
	}

}
