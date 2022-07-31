package poo.challenge41;

public class Outlander extends Car{
    private int roadServices;

    public Outlander(int roadServices) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServices = roadServices;
    }
}
