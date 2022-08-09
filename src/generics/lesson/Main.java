package generics.lesson;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Printer<String> p = new Printer<>("Mauro");
        Printer<Integer> p2 = new Printer<>(2);

        System.out.println(p.thingToPrint);
        System.out.println(p2.thingToPrint);

        List<Integer> intE = new ArrayList<>();
        intE.add(3);
        printList(intE);

        List<String> names = new LinkedList<>();
        names.add("Marlon");
        printList(names);
    }

    public static void printList(List<?> list){
        System.out.println(list.get(0));
    }
}
