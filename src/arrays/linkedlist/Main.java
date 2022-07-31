package arrays.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> placeToVisit = new LinkedList<String>();
        addInOrder(placeToVisit,"Portgual");
        addInOrder(placeToVisit,"England");
        addInOrder(placeToVisit,"Finland");
        addInOrder(placeToVisit,"Japan");
        addInOrder(placeToVisit,"South Africa");

        System.out.println(placeToVisit);

        printList(placeToVisit.iterator());
        placeToVisit.add(2,"Malasya");
        printList(placeToVisit.iterator());
        visit(placeToVisit);
    }

    public static void printList(Iterator linkedlist){
        while(linkedlist.hasNext()){
            System.out.println("Visting " + linkedlist.next());
        }
        System.out.println("___________________________");
    }

    public static boolean addInOrder(LinkedList<String> linkedList, String newCounty){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCounty);
            if (comparison == 0){
                //se for igual, nao adicionar
                System.out.println(newCounty + "is already included as a destionation");
                return false;
            } else if (comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCounty);
                return true;
            }
        }
        stringListIterator.add(newCounty);
        return true;
    }

    public static void visit(LinkedList cities){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities in the itenerary");
        } else {
            System.out.println("Now visting " + listIterator.next());
        }

        while(!quit){
            int action = sc.nextInt();
            sc.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday vacation over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                    }

                    break;
                case 3:
                    printMenu();
                    break;
            }

        }
    }

    public static void printMenu(){
        System.out.println("Available actions: \npress: ");
        System.out.println("""
                0 - to quit
                1- go to next city
                2- go to previous city
                3- print menu options
                """);
    }

}
