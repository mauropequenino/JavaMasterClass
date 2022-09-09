package data_strutures.insertion_sort;
/*
Utilizando a linguagem Java, implemente uma classe que proceda a ordenação de um array
de inteiros de tamanho e elementos definidos pelo utilizador (Utilize o algoritmo de
ordenação por inserção).
 */


import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_4 {
    static Scanner  sc = new  Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many number will you add? ");
        int n = sc.nextInt();
        int [] arr = getArray(n);
        insertionSort(arr);

        for(int i =0; i < arr.length; i++) {
            if(arr[i] % 2 ==  0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static int[] getArray(int n) {
        int[] arr = new int[n];
        for(int i=0; i < arr.length; i++){
            System.out.print("Add number: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentValue = arr[i];

            int j = i - 1;
            while(j >= 0 && arr[j] > currentValue) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currentValue;
        }
    }
}
