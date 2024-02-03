package part2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "alpha", "bravo", "charlie", "delta"));

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-------");
        list.forEach((var myString) -> System.out.println(myString));

        System.out.println("-------");
        String prefix = "nato";
        //String myString = "enclosing Method's myString";
        list.forEach((var myString) -> {
            char first = myString.charAt(0);
            System.out.println(prefix + " " +myString + " means" + first);
        });
        //System.out.println(myString);
        //prefix="NATO";

        int result = calculator((a, b) -> a + b, 5, 2);
        var result2 = calculator((a, b) -> a / b, 10.0, 2.5);
        var result3 = calculator((a, b) -> a +" "+b, "Ralph", "Lauren");
    }//main


    public static <T> T calculator(Operation<T> function, T value1, T value2) {

        T result = function.operate(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }


}//class
