package poo.challenge45;

public class Monitor {
    private String model;
    private String manufactured;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufactured, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufactured = manufactured;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " in colour " + color);
    }
}
