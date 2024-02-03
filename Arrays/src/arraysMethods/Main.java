package arraysMethods;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] newArray = readIntegers(input);
        System.out.println(Arrays.toString(readIntegers(input)));

        System.out.println(findMin(newArray));

    }

    private static int[] readIntegers(String input){
        String[] inputArray = input.split(",");
        int[] intArray = new int[inputArray.length];
        for(int i = 0 ; i<inputArray.length; i++){
            intArray[i] = Integer.parseInt(inputArray[i].trim());
        }
        return intArray;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for(int i=1; i<array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
