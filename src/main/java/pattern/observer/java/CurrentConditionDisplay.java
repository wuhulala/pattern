package pattern.observer.java;


import java.util.Observable;
import java.util.Observer;

/**
 * @author xueaohui
 *
 * 显示当前观测值
 */
public class CurrentConditionDisplay implements DisplayElement,Observer {
    private double temperature;
    private double humidity;
    private Observable weatherData;
    private String name;

    public CurrentConditionDisplay(String name,Observable weatherData) {
        this.name = name;
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void display() {
        System.out.println(this.name +"的信息:   类型:当前观测值面板  温度:"+temperature+" 湿度:" + humidity);
    }



    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            this.temperature = ((WeatherData) o).getTemperature();
            this.humidity = ((WeatherData) o).getHumidity();
            display();
        }
    }
}
