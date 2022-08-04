package training.challenge_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Radio> r = new ArrayList<Radio>();

    public static void main(String[] args) {
        Radio r1 = new Radio();
        r1.addStation("88.3", "Station 1");
        r1.addStation("89.2","Station 2");
        r1.addStation("99.0", "Station 1");
        r1.addStation("99.5","Station 2");
    }
}
