package observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay =
                new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay =
                new StatisticsDisplay(weatherData);

        weatherData.setMeasurementS(80, 65, 30.4f);
        weatherData.setMeasurementS(82, 70, 29.2f);

        weatherData.removeObserver(statisticsDisplay);
        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurementS(78, 90, 29.2f);

        weatherData.removeObserver(currentDisplay);
        weatherData.setMeasurementS(81, 91, 30.2f);
    }
}
