package multiDimensionalArrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] array = new int[4][4];

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                array[i][j] = 10*i + j;
            }
        }

        System.out.println(Arrays.deepToString(array));

        array[1] = new int[] {10, 20, 30};
        System.out.println(Arrays.deepToString(array));

    }//main

}//class
