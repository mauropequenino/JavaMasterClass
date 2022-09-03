package data_strutures.search.binary_search;

public class BinarySearch {
    /* A pesquisa binario so funciona em listas ordenadas
     * A pesquisa binaria cortará a lista pela metade após cada iteração em que não encontrar o elemento procurado
     * Nao percorre toda lista
     */
    public static void main(String[] args) {
        int [] arr = {8,6,9,2,5,3,1,4};
        System.out.println("Position found: " + search(arr, 4));
    }

    private static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length -1;

        while (left <= right) {
            int middle = (left + right) / 2;
            System.out.println(middle);

            if(target < arr[middle]) {
                //too high
                right = middle - 1;
            } else if(target > arr[middle]) {
                //too low
                left = middle + 1;
            } else {
                //just right
                return middle;
            }
        }
        return -1;
    }

}
