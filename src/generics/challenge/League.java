package generics.challenge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class League <T extends Team>{
    String name;
    public ArrayList<T> league = new ArrayList<T>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if(league.contains(team))
            return false;

        league.add(team);
        return true;
    }

    public void showLeagueTab(){
        Collections.sort(league);
        for(T t: league) {
            System.out.println(t.getName() + " : " + t.ranking());
        }
    }
}
