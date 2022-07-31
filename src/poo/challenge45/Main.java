package poo.challenge45;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor monitor = new Monitor("27inch","Acer", 27, new Resolution(2540,1440));
        Motherboard motherboard = new Motherboard("BJ-200","ASUS", 4,6,"V2.46");
        PC pc = new PC(theCase, monitor, motherboard);
        pc.getMonitor().drawPixelAt(1500,1200,"red");
        pc.getMotherboard().loadProgram("Linux Pop OS 20.4");
        pc.getTheCase().pressPowerButton();

  }
}
