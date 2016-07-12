package pattern.observer.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xueaohui
 *
 * 气压数据类
 */
public class WeatherData implements Subject {
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
        System.out.println("发送当前信息开始 - - -");
        notifyObserver();
        System.out.println("发送完成 。 。 。");
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

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObserver() {
        for(Observer o:observers){
            o.update(temperature,humidity,pressure);
        }
    }
}
