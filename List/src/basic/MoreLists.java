package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Test {

}

public class MoreLists {

    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);
        System.out.println(list.getClass().getName());
        //list.add("grapefruit"); //runtime exception. ImmutableList이기 때문에 추가 불가능!

        ArrayList<String> test = new ArrayList<>();
        System.out.println(test);

        String test2 = "string";
        System.out.println(test2);

        Test test3 = new Test();
        System.out.println(test3);

        int[] array = {1,2,3,4};
        System.out.println(array);
        System.out.println(Arrays.toString(array));

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("grapefruit");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);
    }
}
