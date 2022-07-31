package poo.challenge46;

public class Table {
    private String type;
    private String manufacturer;
    private int with;
    private int height;
    private int chars;

    public Table(String type, String manufacturer, int with, int height, int chars) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.with = with;
        this.height = height;
        this.chars = chars;
    }

    public String addingObject(String objName){
        return "Added " + objName + " on the table";
    }

    public String clean(){
        return "Cleaning the table";
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getWith() {
        return with;
    }

    public int getHeight() {
        return height;
    }
}
