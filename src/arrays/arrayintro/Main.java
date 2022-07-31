package arrays.arrayintro;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getIntegers(5);
        for(int i = 0; i<myArray.length;i++){
            System.out.println("Posicao " + i + " possui o valor " + myArray[i]);
        }
        System.out.println("Media do array: " + getAverage(myArray));
    }

    public static int[] getIntegers(int number){
        System.out.println("Insira " + number + " valores inteiros");
        int[] array = new int[number];
        for(int i = 0; i< array.length; i++){
            array[i] = sc.nextInt();
        }
        return  array;
    }

    public static double getAverage(int[] array){
        int sum =0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        return  (double) sum / (double) array.length;
    }
}
