package Inteface;

import Weather.WeatherTower;

public interface Flyable {
    public void updateConditions();

    public void registerTower(WeatherTower WeatherTower);

    public String getFullName();
}
