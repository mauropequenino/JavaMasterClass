package collections.lesson_1;

public class Main{
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Galeria",5,10);
        theatre.getSeats();

        if (theatre.reserveSeat("D08")) {
            System.out.println("Reserved, please pay");
        } else {
            System.out.println("Sorry, seat is taken ");
        }
        if (theatre.reserveSeat("D08")) {
            System.out.println("Reserved, please pay");
        } else {
            System.out.println("Sorry, seat is taken ");
        }
    }
}
