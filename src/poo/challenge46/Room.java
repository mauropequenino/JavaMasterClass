package poo.challenge46;

import poo.challenge45.Dimensions;

public class Room {
    private Dimensions dimensions;
    private String color;
    private double windows;
    private boolean hasBethroom;

    public Room(Dimensions dimensions, String color, double windows, boolean hasBethroom) {
        this.dimensions = dimensions;
        this.color = color;
        this.windows = windows;
        this.hasBethroom = hasBethroom;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getColor() {
        return color;
    }

    public double getWindows() {
        return windows;
    }

    public boolean isHasBethroom() {
        return hasBethroom;
    }
}
