package Fly;

import Aircraft.Aircraft;
import Inteface.Flyable;
import Tower.Coordinates;
import Weather.WeatherTower;

public class Helicopter extends Aircraft implements Flyable {

    private WeatherTower weatherTower;

    public Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    public void updateCondition() {

    }

    public void registerTower(WeatherTower Tower) {

    }
}
