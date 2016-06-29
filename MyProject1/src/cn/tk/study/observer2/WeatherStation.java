/**
 * 
 */
package cn.tk.study.observer2;



/**

 * @ClassName: WeatherStation

 * @Description: TODO

 * @author xiedan11

 * @date 2016年6月28日 下午7:50:09

 *


 */
public class WeatherStation {

	/**
	 * 
	 */
	public WeatherStation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 *
	
	 * @param args
	
	 */
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		weatherData.setMeasurements(11.4f, 12.56f, 13.35f);
		weatherData.setMeasurements(10, 11, 12);
	}

}
