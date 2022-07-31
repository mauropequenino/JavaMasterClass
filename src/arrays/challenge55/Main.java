package arrays.challenge55;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[] {1,2,3,4,5};
        reverseArray(array);
    }

    public static void reverseArray(int[] array){
        for (int i=array.length-1;i>=0;i--){
            System.out.println(array[i]);
        }
    }
}
