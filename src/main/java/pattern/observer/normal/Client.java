package pattern.observer.normal;

/**
 * @author xueaohui
 */
public class Client {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        for(int i = 1 ; i <= 10 ; i++){
            CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay("面板"+i,weatherData);
        }

        for(int i = 1 ; i <= 10 ; i++){
            StatisticsDisplay statisticsDisplay = new StatisticsDisplay("面板"+i,weatherData);
        }
        weatherData.setMeasurements(99,23.9,89.0);
        weatherData.setMeasurements(69,27.9,39.0);

    }
}
