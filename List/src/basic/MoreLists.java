package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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

        System.out.println("Third item =" + groceries.get(2));
        System.out.println(groceries.contains("mustard"));

        groceries.add("yoghurt");
        groceries.add(0,"yoghurt");
        System.out.println("first index of yoghurt = " + groceries.indexOf("yoghurt"));
        System.out.println("last index of yoghurt = " + groceries.lastIndexOf("yoghurt"));

        groceries.remove("yoghurt");
        System.out.println(groceries);

        groceries.removeAll(List.of("bananas", "grapefruit"));
        System.out.println(groceries);

        groceries.retainAll(List.of("apples", "milk", "yoghurt"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println("isEmpty = " + groceries.isEmpty());

        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        System.out.println(groceries);

        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));
        System.out.println(groceries);

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        //System.out.println(groceries.sort(Comparator.naturalOrder()));
        //sort() method의 return type이 void라서

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(groceryArray);
        System.out.println(Arrays.toString(groceryArray));






    }
}
