package collections.lesson_4.exercicios;

import java.util.HashMap;
import java.util.Map;

public class Localizacao {
    private final int locationId;
    private final String description;
    private final Map<String, Integer> exists;

    public Localizacao(int locationId, String description) {
        this.locationId = locationId;
        this.description = description;
        this.exists = new HashMap<String, Integer>();
    }

    public void addExist(String direction, int location) {
        exists.put(direction, location);
    }

    public int getLocationId() {
        return locationId;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExists() {
        return new HashMap<String, Integer>(exists);
    }
}
