package pattern.observer.java;



import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * @author xueaohui
 *
 * 气压数据类
 */
public class WeatherData extends Observable {
    /**
     * 温度
     */
    private double temperature;
    /**
     * 湿度
     */
    private double humidity;
    /**
     * 气压
     */
    private double pressure;

    /**
     * 观察者们
     */
    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    /**
     * 气象更新 此方法会被调用
     */


    public void measurementsChanged(){
        System.out.println("java内置\n  发送当前信息开始 - - - -");
        setChanged();
        notifyObservers();
        System.out.println("发送完成 。 。 。");
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    /**
     * 更新气象
     */
    public void setMeasurements(double temperature,double humidity,double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
