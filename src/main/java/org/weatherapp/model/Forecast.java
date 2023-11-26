package org.weatherapp.model;

public class Forecast {

    private String city;
    private String country;
    private Integer temperature;
    private String weatherDescription;

    public Forecast(final String city, final String country, final Integer temperature, final String weatherDescription) {
        this.city = city;
        this.country = country;
        this.temperature = temperature;
        this.weatherDescription = weatherDescription;
    }

    public String getCity() {
        return city;
    }

     public String getCountry() {
        return country;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", temperature=" + temperature +
                ", weatherDescription='" + weatherDescription + '\'' +
                '}';
    }
}
