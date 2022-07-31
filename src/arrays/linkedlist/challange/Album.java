package arrays.linkedlist.challange;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    /*
    * Adiciona uma msuica ao arraylsit inicializado no construtor
    * Antes de adicionar verfica se nao existe uma musica com mesmo titulo
    * Retorna true se for adicionada e false caso contrario
    * */

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    /*
    * Verificar se existe uma musica procurada percorrendo o arraylist criado
    * Rtorna o objecto record da musica encontrada
    * */
    private Song findSong(String title){
        for (Song checkedSong : this.songs){
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }


    /*
    * Adicionar uma musica a playlist via o numero da musica
    * @param int tracNumber = numero da faixa
    * @param ArrayList<Song> = objecto da musica
    * */
    public boolean addToPlaylist(int trackNumber, List<Song> playlist){
        int index = trackNumber - 1;
        if((index >= 0) && (index <= this.songs.size())){
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This ablum doesnt have a track " + trackNumber);
        return false;
    }

    /*
     * Adicionar uma musica a playlist via o nome da faixa
     * @param String title = nome da faixa
     * @param ArrayList<Song> = objecto da musica
     * */
    public boolean addToPlaylist(String title, List<Song> playlist) {
        Song checkedSong = findSong(title);
        if(checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }

        System.out.println("This album doesnt have a track named " + title);
        return false;
    }

    /*
    * Exibir todas as musicas de todos os albums
    * */
    public void printAllSong(){
        for (int i=0;i<songs.size();i++){
            System.out.println(this.artist + " - " + this.songs.get(i));
        }
    }

    @Override
    public String toString() {
        return this.artist + " - " + this.name;
    }
}
