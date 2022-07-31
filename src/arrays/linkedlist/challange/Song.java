package arrays.linkedlist.challange;

public class Song {
    private String title;
    private double duraction;

    public Song(String title, double duraction) {
        this.title = title;
        this.duraction = duraction;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + " : " + duraction ;
    }
}
