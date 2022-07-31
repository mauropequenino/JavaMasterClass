package arrays.linkedlist.challange;

import java.util.*;


public class Main {
    private static List<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Nothing Was The Same","Drake");
        album.addSong("Tuscasn Leather",6.06);
        album.addSong("Started From the Bottom",2.54);
        album.addSong("Own It",4.12);
        album.addSong("From Time",3.50);
        album.addSong("Furthest Thing",4.27);
        album.addSong("Worst Behavior",4.30);
        albums.add(album);

        album = new Album("4 Your Eyez Only", "J. Cole");
        album.addSong("For Whom the Bell Tolls", 2.08);
        album.addSong("Immortal", 3.20);
        album.addSong("Deja Vu", 4.26);
        album.addSong("Ville Mentality", 2.08);
        album.addSong("Change", 5.31);
        albums.add(album);

        List<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Started From the Bottom", playlist);
        albums.get(0).addToPlaylist("From Time", playlist);
        albums.get(0).addToPlaylist("Furthest Thing", playlist);
        albums.get(0).addToPlaylist(1,playlist);
        albums.get(0).addToPlaylist(5,playlist);
        albums.get(0).addToPlaylist(6,playlist);

        play(playlist);

    }

    public static void play(List<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> iterator = playlist.listIterator();
        if(playlist.size() == 0){
            System.out.println("No song on playlist");
            return;
        } else {
            System.out.println("Now playing " + iterator.next());
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        forward = true;
                    }
                    if (iterator.hasNext()){
                        System.out.println("Now playing " + iterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        forward = false;
                    }
                    if (iterator.hasPrevious()){
                        System.out.println("Now playing " + iterator.previous().toString());
                    } else {
                        System.out.println("We have reached the top of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                case 4:
                    printPlayList(playlist);
                    break;
                case 5:
                    printAlbums(albums);
                case 6:
                    printMenu();
                    break;
            }
        }
    }

    private static void printAlbums(List<Album> albums) {
        System.out.println("=========================");
        System.out.println("\tALL ALBUMS");
        for (int i=0;i<albums.size();i++){
            System.out.println(albums.get(i).toString());
            albums.get(i).printAllSong();
        }
        System.out.println("==========================");
    }

    public static void printMenu(){
        System.out.println("Available actions: \npress: ");
        System.out.println("""
                0 - to quit
                1- go to next city
                2- go to previous city
                3- to replay the current song
                4- print playlist current playlist
                5- print menu options 
                """);
    }

    public static void printPlayList(List<Song> playlist){
        Iterator<Song> iterator = playlist.listIterator();
        System.out.println("==================================");
        System.out.println("\tPLAYLIST");
        for (int i = 0; i<playlist.size();i++){
            System.out.println((i+1) + " - " + iterator.next());
        }
        System.out.println("==================================");
    }
}
