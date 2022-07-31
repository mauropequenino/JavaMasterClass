package arrays.linkedlist.sort_number;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class SortNumbers {
    public static void main(String[] args) {
        LinkedList<Integer> listNumbers = new LinkedList<Integer>();
        listNumbers = getRandomNumbers();
//        sortListNumber(listNumbers);

        System.out.println(listNumbers);
    }

    public static LinkedList<Integer> getRandomNumbers (){
        LinkedList<Integer> generatedNumbers = new LinkedList<>();
            for (int i =0;i<10;i++){
                int random = (int) (Math.random() * 100 ) + 1;
                generatedNumbers.add(random);
            }

        LinkedList<Integer> newListNumbers = new LinkedList<>();
        ListIterator<Integer> intListNumbers = generatedNumbers.listIterator();

        for (int i=0;i<generatedNumbers.size();i++) {
            int comparision = intListNumbers.next().compareTo(generatedNumbers.get(i));
            if (comparision > 0) {
                newListNumbers.add(intListNumbers.next());
            }
            newListNumbers.add(intListNumbers.next());
        }
            return newListNumbers;
    }

    public static boolean sortListNumber(LinkedList<Integer> listNumbers){

        return true;
    }
}
