package arrays.challenge54;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] intArray = readIntegers(5);
        System.out.println("findMin() = " + findMin(intArray));
    }

    public static int[] readIntegers(int count){
        int[] array = new int[count];
        for (int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        return  array;
    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i=0;i<array.length-1;i++){
            if(min > array[i+1]){
                min = array[i];
            }
        }
        return min;
    }
}
