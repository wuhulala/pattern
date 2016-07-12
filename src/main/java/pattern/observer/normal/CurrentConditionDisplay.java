package pattern.observer.normal;

/**
 * @author xueaohui
 *
 * 显示当前观测值
 */
public class CurrentConditionDisplay implements DisplayElement,Observer {
    private double temperature;
    private double humidity;
    private Subject weatherData;
    private String name;

    public CurrentConditionDisplay(String name,Subject weatherData) {
        this.name = name;
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println(this.name +"的信息:   类型:当前观测值面板  温度:"+temperature+" 湿度:" + humidity);
    }

    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
