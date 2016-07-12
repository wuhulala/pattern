package pattern.observer.java;


import java.util.Observable;
import java.util.Observer;

/**
 * @author xueaohui
 */
public class StatisticsDisplay implements DisplayElement,Observer {
    private double minTemperature;
    private double minHumidity;
    private Observable weatherData;
    private String name;

    public StatisticsDisplay(String name,Observable weatherData) {
        this.name = name;
        this.weatherData = weatherData;
        this.minHumidity = 10000;
        this.minTemperature = 10000;
        weatherData.addObserver(this);
    }

    public void display() {
        System.out.println(this.name +"的信息:   类型:最小值面板     最小温度:"+minTemperature+"     最小湿度:" + minHumidity);
    }

    public void update(double temperature, double humidity, double pressure) {
        this.minTemperature = this.minTemperature < temperature ? this.minTemperature : temperature ;
        this.minHumidity = this.minHumidity < humidity ? this.minHumidity : humidity ;
        display();
    }

    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            this.minTemperature = this.minTemperature < ((WeatherData) o).getTemperature() ? this.minTemperature : ((WeatherData) o).getTemperature();
            this.minHumidity = this.minHumidity < ((WeatherData) o).getHumidity() ? this.minHumidity : ((WeatherData) o).getHumidity();
            display();
        }
    }
}
