package poo.challenge45;

public class Case {
    private String model;
    private String manufactured;
    private String powersupply;
    private Dimensions dimensions;

    public Case(String model, String manufactured, String powersupply, Dimensions dimensions) {
        this.model = model;
        this.manufactured = manufactured;
        this.powersupply = powersupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){
        System.out.printf("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufactured() {
        return manufactured;
    }

    public String getPowersupply() {
        return powersupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
