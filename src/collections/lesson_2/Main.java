package collections.lesson_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Galeria",5,10);
        //Copiar um objecto
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        seatCopy.get(1).reserved();
        if(theatre.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }

        /* Ordenar de forma decrescente */
        Collections.reverse(seatCopy);
        System.out.println("Printing reverse seat copy");
        printList(seatCopy);
        System.out.println("Printing theatre.seat");
        printList(theatre.seats);

        /* Barelhar a lista */
        Collections.shuffle(seatCopy);
        System.out.println("Printing shuffle seat copy");
        printList(seatCopy);

        /* Repar o min e o max elemento da lista*/
        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number is: " + minSeat.getSeatNumber());
        System.out.println("Max seat number is: " + maxSeat.getSeatNumber());
    }

    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat: list) {
            System.out.print (" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("==============================================================");
    }
}
