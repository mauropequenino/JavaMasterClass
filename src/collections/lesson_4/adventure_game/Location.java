package collections.lesson_4.adventure_game;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exists;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exists = new HashMap<String, Integer>();
    }

    public void addExist(String direction, int location) {
        exists.put(direction, location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExists() {
        return new HashMap<String, Integer>(exists);
    }
}
