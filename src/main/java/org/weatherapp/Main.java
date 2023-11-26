package org.weatherapp;

import org.weatherapp.model.Forecast;
import org.weatherapp.model.WeatherToForecastMapper;
import org.weatherapp.webclient.WeatherApiClient;

import java.io.IOException;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        WeatherApiClient weatherApiClient = new WeatherApiClient();
        WeatherToForecastMapper weatherToForecastMapper = new WeatherToForecastMapper();
        final HttpResponse<String> response = weatherApiClient.getWeather("Gdynia");

        System.out.println("To jest JSON: ");
        System.out.println(response.body());


        Forecast forecast = weatherToForecastMapper.mapToForecast(response.body());
        System.out.println("To jest nasz obiekt:");
        System.out.println(forecast.toString());

    }
}