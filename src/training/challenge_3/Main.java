package training.challenge_3;

import java.util.*;

public class Main {
    private static List<Radio> r = new ArrayList<Radio>();

    public static void main(String[] args) {
        Radio r1 = new Radio();
        r1.addStation("88.3", "Station 1");
        r1.addStation("89.2","Station 2");
        r1.addStation("99.0", "Station 3");
        r1.addStation("99.5","Station 4");
        r.add(r1);

        LinkedList<Station> favorites = new LinkedList<Station>();
        r.get(0).addFavoriteStation(1, favorites);
        r.get(0).addFavoriteStation(2, favorites);
        r.get(0).addFavoriteStation(3, favorites);

        play(favorites);
    }

    public static void play(LinkedList<Station> favorites) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Station> iterator = favorites.listIterator();
        if(favorites.size() == 0) {
            System.out.println("No favortie stations");
        } else {
            System.out.println("Now playing " + iterator.next().getCode());
        }

        while (!quit) {
            int action = sc.nextInt();
            sc.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Complete favorite");
                    quit = true;
                    break;
                case 1:
                    if(!forward) {
                        if(iterator.hasNext()) {
                            iterator.next();
                        }
                        forward = true;
                    }

                    if (iterator.hasNext()){
                        System.out.println("Now playing " + iterator.next().getCode());
                    } else {
                        System.out.println("We have reached the end of the favorite stations");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward) {
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        forward = false;
                    }
                    if(iterator.hasPrevious()){
                        System.out.println("Now playing " + iterator.previous().getCode());
                    } else {
                        System.out.println("We have reached the top of the favorite stations");
                        forward = true;
                    }
                    break;
                case 3:
                    printFavoriteStations(favorites);
                    break;
                case 4:
                    printMenu();
                    break;
            }
        }
    }

    public static void printMenu(){
        System.out.println("Available actions: \npress: ");
        System.out.println("""
                0 - to quit
                1- go to next station
                2- go to previous station
                3- print current playlist
                4- print menu options 
                """);
    }

    public static void printFavoriteStations(LinkedList<Station> favorite){
        ListIterator<Station> iterator = favorite.listIterator();
        System.out.println("============================");
        System.out.println("Favorite");
        for(int i=0;i<favorite.size();i++){
            System.out.println(iterator.next().getCode());
        }
        System.out.println("=============================");
    }


}
