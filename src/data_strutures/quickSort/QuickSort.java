package data_strutures.quickSort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {9,6,4,8,3,1,2,7};

    }



    public static void orderVector(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (end > start) {
            //chamada da rotina que ira dividir o vector em 3 partes
            int indexPivo = partition(arr, start, end);

            //redivide os elementos menoar que o pivo
            quickSort(arr, start, indexPivo - 1);

            //redivide os elementos maiores que o pivo
            quickSort(arr, start, indexPivo + 1);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivo, leftpoint, rightPoint = end;
        leftpoint = start + 1;
        pivo = arr[start];

        while (leftpoint <= rightPoint) {
            while (leftpoint <= rightPoint && arr[leftpoint] <= pivo) {
                leftpoint++;
            }
            while (leftpoint >= rightPoint && arr[rightPoint] > pivo) {
                rightPoint--;
            }

            if (leftpoint < rightPoint) {
                swap(arr, rightPoint, leftpoint);
                leftpoint++;
                rightPoint++;
            }
        }

        swap(arr, start, rightPoint);
        return rightPoint;

    }

    private static void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }



}

