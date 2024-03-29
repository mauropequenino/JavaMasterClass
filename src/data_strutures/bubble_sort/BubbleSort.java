package data_strutures.bubble_sort;

import java.util.Arrays;
/*
* Algoritmo: Percorre várias vezes o vetor de maneira sequencial (passos). Em cada passo, compara cada elemento
* no vetor com o seu sucessor (p[i] com p[i+1]) e troca o conteúdo das posições em análise, caso não estejam
* na ordem desejada.
 */

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {24,32,11,60,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        boolean swap = true;

        while(swap) {
            swap = false;
            for(int i = 0; i < arr.length -1; i++) {
                if(arr[i] > arr[i +1]) {
                    swap = true;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
