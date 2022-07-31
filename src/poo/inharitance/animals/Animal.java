package poo.inharitance.animals;

public class Animal {
    private String name;
    private int legs;
    private String environment;
    private String colour;
    private double size;
    private double speed;

    public Animal(String name, int legs, String environment, String colour, double size, double speed) {
        this.name = name;
        this.legs = legs;
        this.environment = environment;
        this.colour = colour;
        this.size = size;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public String getEnvironment() {
        return environment;
    }

    public String getColour() {
        return colour;
    }

    public double getSize() {
        return size;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", legs=" + legs +
                ", environment='" + environment + '\'' +
                ", colour='" + colour + '\'' +
                ", size=" + size +
                ", speed=" + speed +
                '}';
    }
}
