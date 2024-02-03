package reverseArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arrayEven = {1,2,3,4};
        System.out.println(Arrays.toString(reverse(arrayEven)));

        int[] arrayOdd = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(arrayOdd)));

    }//main

    private static int[] reverse(int[] array){
        for(int i=0; i<array.length/2; i++) {
            int j = array.length - 1 - i;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }//method


}
