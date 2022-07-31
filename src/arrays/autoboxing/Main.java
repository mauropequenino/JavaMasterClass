package arrays.autoboxing;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] srtArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> srtArrayList = new ArrayList<String>();
        srtArrayList.add("John");

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        //Autoboxing
        for (int i = 0; i<10;i++) intArrayList.add(Integer.valueOf(i));
        //unboxing
        for (int i=0; i<10;i++) System.out.println(i + " - " + intArrayList.get(i).intValue());

        ArrayList<Double> doubleArrayList = new ArrayList<Double>();
        for (double i =0 ;i <10; i += 0.5) {
            doubleArrayList.add(i);
        }
        for (int i =0; i<10; i++) {
            double value = doubleArrayList.get(i);
            System.out.println(i + " - " + value);
        }

    }
}
