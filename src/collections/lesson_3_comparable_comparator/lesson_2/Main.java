package collections.lesson_3_comparable_comparator.lesson_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Comparable e comparable sao interfaces que servem para armazenar e ordenacar objectos numma collecao*/
public class Main{
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Galeria",8,12);

        if(theatre.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }

        if(theatre.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }

        if(theatre.reserveSeat("B13")) {
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Seat already reserved");
        }

        List<Theatre.Seat> reserveSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reserveSeats);
        printList(reserveSeats);

        /* Ordenar a lista atraves do comparator*/
        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13));
        priceSeats.add(theatre.new Seat("A00", 13));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);

    }

    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat: list) {
            System.out.print (" " + seat.getSeatNumber() + " - " + seat.getPrice() + " | ");
        }
        System.out.println();
        System.out.println("==============================================================");
    }
}
