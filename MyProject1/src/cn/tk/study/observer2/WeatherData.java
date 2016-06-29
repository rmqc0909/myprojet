/**
 * 
 */
package cn.tk.study.observer2;

import java.util.Observable;


/**

 * @ClassName: WeatherData

 * @Description: 使用Java内置的观察者模式

 * @author xiedan11

 * @date 2016年6月28日 下午4:28:25

 *


 */
public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	
	/**
	 * 
	 */
	public WeatherData() {
	}
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.humidity = humidity;
		this.temperature = temperature;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	/**
	 * @return the temperature
	 */
	public float getTemperature() {
		return temperature;
	}
	/**
	 * @return the humidity
	 */
	public float getHumidity() {
		return humidity;
	}
	/**
	 * @return the pressure
	 */
	public float getPressure() {
		return pressure;
	}
}
