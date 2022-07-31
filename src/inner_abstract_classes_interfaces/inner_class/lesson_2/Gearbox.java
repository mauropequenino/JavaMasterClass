package inner_abstract_classes_interfaces.inner_class.lesson_2;

import java.util.ArrayList;
import java.util.List;

public class Gearbox {
    private List<Gear> gears;
    private int maxGears;
    private int gearNumber = 0;
    private boolean cluchIsIn;
    private int currentGear;
    public Gearbox(int maxGears){
        this.maxGears =maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);
    }

    public void operateCluth(boolean in) {
        this.cluchIsIn = in;
    }

    public void addGear(int number, double ratio){
        if((number >0) && (number <= maxGears)) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear){
        if((newGear>=0) && (newGear < this.gears.size()) && this.cluchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");
        } else {
            System.out.println("Grind");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if(cluchIsIn) {
            System.out.println("Scream");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    public class Gear {
        private int gearNumber;
        private double ratio;

        public int getGearNumber() {
            return gearNumber;
        }

        public double getRatio() {
            return ratio;
        }

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }
    }

}
