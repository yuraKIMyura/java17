package arraysChallenge;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {50, 25, 80, 5, 15};
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int[] arrayDesc = new int[array.length];
        for(int i=0; i<array.length; i++) {
            arrayDesc[i] = array[array.length-1-i];
        }
        System.out.println(Arrays.toString(arrayDesc));



        int[] newArray = Arrays.copyOf(array, array.length);


    }//main
}
