package poo.challenge41;

public class Vehicle {
    private String name;
    private  String size;
    private int currentDirection;
    private int currentVelocity;

    public Vehicle(String name, String size){
        this.name = name;
        this.size = size;
        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + "degres");
    }

    public void move(int direction,int velocity){
        this.currentVelocity = velocity;
        this.currentVelocity = direction;
        System.out.println("Vehicle.move(): Moving at: " + currentVelocity + " in direction " + currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }
}
