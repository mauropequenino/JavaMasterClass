package data_strutures.search.line_search;

public class LineSearch {
    /* Pesquisa cada elemento do array ate encontrar o elemento desejado,
    * nao importa se o array esta ou nao ordenado
    * */
    public static void main(String[] args) {
        int [] arr = {8,6,9,2,5,3,1,4};
        System.out.println("Position found: " + search(arr, 2));
    }

    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return  -1;
    }

}
