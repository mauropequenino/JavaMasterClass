package arrays.referencevsvalue;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int intValue = 10;
        int anotherIntValue = intValue;

        System.out.println("intArray = " + intValue);
        System.out.println("anotherIntArray = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("intArray = " + intValue);
        System.out.println("anotherIntArray = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherInArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("myIntArray = " + Arrays.toString(anotherInArray));
        myIntArray[1] = 2;
        anotherInArray[0] = 1;

        //Desfaz a reference se o array eh iniciado
        anotherInArray = new int[]{4,5,6,7,8};
        modifyArray(myIntArray);
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("myIntArray = " + Arrays.toString(anotherInArray));

    }

    public static void modifyArray(int[] array){
        array[0] = 5;
        array = new int[]{1,2,3,4,5};
    }
}
