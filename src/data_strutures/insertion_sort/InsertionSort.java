package data_strutures.insertion_sort;

import java.util.Arrays;


/*
* Tem complexidade de tempo de n2, o que significa que a medida que o numero de elementos que se deseja
* ordenar, a qunantidade do tempo que leva a ordenar aumentar exponencialmente
* */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {24,32,11,60,3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
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
