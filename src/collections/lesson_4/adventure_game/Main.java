package collections.lesson_4.adventure_game;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        locations.put(0, new Location(0, "You are sitting in front of a computer learning java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a samll bridge"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExist("W", 2);
        locations.get(1).addExist("E", 3);
        locations.get(1).addExist("S", 4);
        locations.get(1).addExist("N", 5);
        locations.get(1).addExist("Q", 2);

        locations.get(2).addExist("N", 5);
        locations.get(2).addExist("Q", 0);

        locations.get(3).addExist("w", 2);
        locations.get(3).addExist("Q", 0);

        locations.get(4).addExist("N", 1);
        locations.get(4).addExist("W", 2);
        locations.get(4).addExist("Q", 0);

        locations.get(5).addExist("W", 2);
        locations.get(5).addExist("S", 1);
        locations.get(5).addExist("Q", 0);

        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExists();
            System.out.print("Available exists are ");
            for(String exit: exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = sc.nextLine().toUpperCase();

            if(exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else  {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}
