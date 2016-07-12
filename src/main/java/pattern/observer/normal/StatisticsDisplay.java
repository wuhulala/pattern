package pattern.observer.normal;

/**
 * @author xueaohui
 */
public class StatisticsDisplay implements DisplayElement,Observer {
    private double minTemperature;
    private double minHumidity;
    private Subject weatherData;
    private String name;

    public StatisticsDisplay(String name,Subject weatherData) {
        this.name = name;
        this.weatherData = weatherData;
        this.minHumidity = 10000;
        this.minTemperature = 10000;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println(this.name +"的信息:   类型:最小值面板     最小温度:"+minTemperature+"     最小湿度:" + minHumidity);
    }

    public void update(double temperature, double humidity, double pressure) {
        this.minTemperature = this.minTemperature < temperature ? this.minTemperature : temperature ;
        this.minHumidity = this.minHumidity < humidity ? this.minHumidity : humidity ;
        display();
    }
}
