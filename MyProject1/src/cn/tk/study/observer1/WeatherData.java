/**
 * 
 */
package cn.tk.study.observer1;

import java.util.ArrayList;

/**

 * @ClassName: WeatherData

 * @Description: TODO

 * @author xiedan11

 * @date 2016年6月28日 上午11:01:29

 *


 */
public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	

	public WeatherData() {
		// TODO Auto-generated constructor stub
		observers = new ArrayList<Observer>();
	}

	
	/* (non-Javadoc)
	 * @see cn.tk.study.observer.Subject#registerObserver(cn.tk.study.observer.Observer)
	 */
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	/* (non-Javadoc)
	 * @see cn.tk.study.observer.Subject#removeObserver(cn.tk.study.observer.Observer)
	 */
	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if(i >= 0)
		{
			observers.remove(i);
		}
	}

	/* (non-Javadoc)
	 * @see cn.tk.study.observer.Subject#notifyObserver(cn.tk.study.observer.Observer)
	 */
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(int i = 0; i < observers.size(); i++)
		{
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	/**
	 *


	 */
	public void measurementsChanged() {
		// TODO Auto-generated method stub
		notifyObservers();
	}
	/**
	 *


	 */
	public void setMeasurements(float temperature, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.humidity = humidity;
		this.temperature = temperature;
		this.pressure = pressure;
		measurementsChanged();
	}
}
