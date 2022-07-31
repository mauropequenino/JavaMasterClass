package poo.inharitance.animals;

public class Fish extends Animal{
    private String characteristics;

    public Fish(String name, double size, double speed, String characteristics) {
        super(name,0, "Mar", "Cinzento", size, speed);
        this.characteristics = characteristics;
    }

    public String getCharacteristics() {
        return characteristics;
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
                "\nCaracteristicas= " + characteristics + '\'' +
                '}';
    }
}
