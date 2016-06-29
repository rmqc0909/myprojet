/**
 * 
 */
package cn.tk.study.observer2;

import java.util.Observable;
import java.util.Observer;

/**

 * @ClassName: ForecastDisplay

 * @Description: TODO

 * @author xiedan11

 * @date 2016年6月29日 下午2:08:11

 *


 */
public class ForecastDisplay implements DisplayElement, Observer {
	Observable observable;
	private float temperature;
	private float humidity;
	/**
	 * 
	 */
	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData)
		{
			WeatherData weatherData = (WeatherData) o;
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
		System.out.println("预报temperature:" + temperature + ",humidity:" + humidity);
	}

}
