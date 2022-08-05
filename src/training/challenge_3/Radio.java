package training.challenge_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Radio {
    private List<Station> stations;

    public Radio(){
        this.stations = new ArrayList<Station>();
    }

    public boolean addStation(String code, String name) {
        if(findStation(code) == null) {
            stations.add(new Station(code,name));
            return true;
        }
        return false;
    }

    public boolean removeStation(String code) {
        Station s = findStation(code);
        if(s != null) {
            stations.remove(s);
            return true;
        }
        return false;
    }

    public boolean addFavoriteStation(int stationPosition, LinkedList<Station> favorites){
        int i = stationPosition - 1;
        if((i >= 0) && (i <= favorites.size())){
            favorites.add(stations.get(i));
            return true;
        }
        return false;
    }

    public boolean addFavoriteStation(String code, LinkedList<Station> favorites) {
        Station s = findStation(code);
        if(s != null) {
            favorites.add(s);
            return true;
        }
        return false;
    }

    private Station findStation(String code){
        for(Station s : stations) {
            if(s.getCode().equalsIgnoreCase(code)) {
                return s;
            }
        }
        return null;
    }

    private void printAllStations(){
        for(Station s : stations){
            System.out.println(s.getCode() + " - " + s.getName());
        }
    }
}
