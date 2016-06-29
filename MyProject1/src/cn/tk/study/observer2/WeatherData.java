/**
 * 
 */
package cn.tk.study.observer2;

import java.util.Observable;


/**

 * @ClassName: WeatherData

 * @Description: ʹ��Java���õĹ۲���ģʽ

 * @author xiedan11

 * @date 2016��6��28�� ����4:28:25

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
