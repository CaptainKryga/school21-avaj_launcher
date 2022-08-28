package Fly;

import Aircraft.Aircraft;
import Inteface.Flyable;
import Tower.Coordinates;
import Weather.WeatherTower;

public class Baloon extends Aircraft implements Flyable {
    public Baloon(String name, Coordinates coordinates) {
        super(name, coordinates);
        type = "Baloon";
    }

    public void updateCondition() {

    }

    public void registerTower(WeatherTower Tower) {
        Tower.register(this);
    }
}
