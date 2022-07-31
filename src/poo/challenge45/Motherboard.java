package poo.challenge45;

public class Motherboard {
    private String model;
    private String manufactured;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufactured, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufactured = manufactured;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String progamName){
        System.out.println("Program: " + progamName + "is now loading");
    }

    public String getModel() {
        return model;
    }

    public String getManufactured() {
        return manufactured;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
