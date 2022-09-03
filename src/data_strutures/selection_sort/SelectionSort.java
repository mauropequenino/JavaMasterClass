package data_strutures.selection_sort;

/*
* Encontra o menor elemento do array e troca com a primeira posicao
* Encontra o segundo menor elemento e troca com a segunda posicao
*
* */

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {24,32,11,60,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int smallestNumber = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[smallestNumber]) {
                    smallestNumber = j;
                }
            }
            swap(arr, i, smallestNumber);
        }
    }

    public static void swap(int[] arr, int i, int smallestNumber) {
        int aux = arr[i];
        arr[i] = arr[smallestNumber];
        arr[smallestNumber] = aux;
    }
}
