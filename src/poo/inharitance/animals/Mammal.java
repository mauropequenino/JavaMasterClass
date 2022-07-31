package poo.inharitance.animals;

public class Mammal extends Animal{
    private String food;

    public Mammal(String name, int legs, String colour, double size, double speed, String food) {
        super(name, legs, "Terra", colour, size, speed);
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "\nName= " + getName() +
                "\nLegs= " + getLegs() +
                "\nComprimento= " + getSize() +
                "\nCor= " + getColour() +
                "\nAmbiente= " + getEnvironment() +
                "\nVelocidade= " + getSpeed() +
                "\nAlimento= " + getFood() + '\'' +
                '}';
    }


}
