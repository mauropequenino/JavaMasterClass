package inner_abstract_classes_interfaces.interfaces.challenge;

import java.util.ArrayList;
import java.util.List;

public class Monster implements Isaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        ArrayList<String> values= new ArrayList<String>();
        values.add(0, this.name);
        values.add(1," " + this.hitPoints);
        values.add(2, " " + this.strength);
        return values;
    }

    @Override
    public void read(List<String> saveValues) {
        if(saveValues != null && saveValues.size() > 0) {
            this.name = saveValues.get(0);
            this.hitPoints = Integer.parseInt(saveValues.get(1));
            this.strength = Integer.parseInt(saveValues.get(2));
        }
    }
}
