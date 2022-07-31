package poo.challenge41;

public class Car extends Vehicle{
    private int wheels, doors, gears, currentGear;
    private boolean isManual;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void setCurrentGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear");
    }

    public void changeVelocity(int direction, int velocity){
        move(direction, velocity);
        System.out.println("Car.changeVelocity(): Velocity " + velocity + " direction " + direction);
    }

    public void stop(){
        this.currentGear = 0;
    }

}
