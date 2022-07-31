package arrays.resizearray;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 integers");
        getInput();
        printArray(baseData);
        resizedArray(baseData);
        baseData[10] = 67;
        baseData[11] = 34;
        printArray(baseData);
    }

    private static void getInput(){
        for(int i=0;i<baseData.length;i++){
            baseData[i] = sc.nextInt();
        }
    }

    private static void printArray(int[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void resizedArray(int[] arr){
        int[] original = baseData;
        baseData = new int[12];
        for (int i=0;i< original.length;i++){
            baseData[i] = original[i];
        }
    }
}
