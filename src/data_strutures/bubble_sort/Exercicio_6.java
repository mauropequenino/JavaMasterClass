package data_strutures.bubble_sort;

/*
Com recurso a classe criada no exercício anterior, desenvolva na linguagem Java um
programa que receba o número de vendas dos vendedores e imprima o ranking destes em
ordem decrescente.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_6 {


    static Scanner sc = new  Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many number will you add? ");
        int n = sc.nextInt();
        int [] arr = getArray(n);
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] getArray(int n) {
        int[] arr = new int[n];
        for(int i=0; i < arr.length; i++){
            System.out.print("Add number: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void bubbleSort(int[] arr) {
        boolean swap = true;

        while(swap) {
            swap = false;
            for(int i = 0; i < arr.length -1; i++) {
                if(arr[i] < arr[i +1]) {
                    swap = true;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
