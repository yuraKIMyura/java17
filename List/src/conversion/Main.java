package conversion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] originalArray = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);
        System.out.println(originalList);

        originalList.set(0, "one");
        System.out.println("list: "+originalList);
        System.out.println("array: "+Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("list: "+originalList);
        System.out.println("array: "+Arrays.toString(originalArray));

        //originalList.remove(0);
        //originalList.add("Fourth");
        //not possible because the Arrays.asList() method creates a fixed-size list backed by the original array.

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);

    }//main

}//class
