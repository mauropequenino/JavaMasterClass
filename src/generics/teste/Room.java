package generics.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Room <T extends Team>{
    String name;
    public ArrayList<T> room = new ArrayList<T>();

    public Room(String name) {this.name = name;}

    public boolean add(T team) {
        if(room.contains(team)) {
            return false;
        } else {
            room.add(team);
            return true;
        }
    }

    public void showRoomTab() {
        Collections.sort(room);
        System.out.println();
        for(T t : room) {
            System.out.println(t.getName() + " - " + t.ranking());
        }
    }
}
