package Tower;

import java.util.List;
import java.util.ArrayList;

import Inteface.Flyable;
import Simulator.CustomLogger;
import Weather.WeatherProvider;

public class Tower {
    private List<Flyable> observers = new ArrayList<Flyable>();

    public void register(Flyable flyable) {
        observers.add(flyable);
        CustomLogger.singleton.addNewLog("Tower says: " + flyable.getFullName() + " registered to weather tower.");
    }

    public void unregister(Flyable flyable) {
        CustomLogger.singleton.addNewLog("Tower says: " + flyable.getFullName() + " unregistered from weather tower.");
        observers.remove(flyable);
    }

    protected void conditionsChanged() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).updateCondition();
        }
    }

}
