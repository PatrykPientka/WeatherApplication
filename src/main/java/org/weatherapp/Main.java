package org.weatherapp;

import org.weatherapp.webclient.WeatherApiClient;

import java.io.IOException;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        WeatherApiClient weatherApiClient = new WeatherApiClient();
        final HttpResponse<String> gdynia = weatherApiClient.getWeather("Gdynia");

        System.out.println(gdynia.body());

    }
}