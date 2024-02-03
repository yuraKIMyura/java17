package twoDimensionalArrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] array = {{0,0,0,0}, {1,2,3,4}, {0,0,0,0}, {5,6,7,8}};

        for(int[] outer : array){
            for(int inner : outer){
                System.out.print(inner);
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(array));

    }//main

}//class
