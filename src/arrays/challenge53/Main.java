package arrays.challenge53;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myarray = getIntegers(5);
        int[] newArray = sortedArray(myarray);
        printArray(newArray);

    }

    public static int[] getIntegers(int number){
        int[] array = new int[number];
        System.out.println("Insira " + number + " numeros inteiros");
        for (int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i: array) {
            System.out.print(i + " ");
        }
    }

    public static int[] sortedArray(int[] array){
        int[] newArray = new int[array.length];
        for (int i=0;i< array.length;i++){
            newArray[i] = array[i];
        }

        int temp = 0;
        boolean flag = true;
        while(flag){
            flag = false;
            for (int i=0;i< newArray.length -1;i++) {
                if (newArray[i] > newArray[i + 1]) {
                    temp = newArray[i];
                    newArray[i] = newArray[i + 1];
                    newArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return newArray;
    }
}
