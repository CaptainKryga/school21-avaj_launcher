package Aircraft;

import Tower.Coordinates;

public class Aircraft {
    protected long id;
    protected String name;
    protected Coordinates coordinates;

    private static long idCounter;

    protected Aircraft(String name, Coordinates coordinates) {
        this.name = name;
        this.coordinates = coordinates;
        this.id = this.nextId();
    }

    private long nextId() {
        return idCounter++;
    }

}
