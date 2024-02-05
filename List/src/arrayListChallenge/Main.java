package arrayListChallenge;

import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static List<String> list = new ArrayList<>();
    public static void main(String[] args) {

        while(true) {
            showMenu();

            int option = scanner.nextInt();
            switch (option) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    addItems();
                    break;
                case 2:
                    removeItems();
                    break;
            }
        }
    }//main

    private static void showMenu(){
        System.out.println("Available actions:");
        System.out.println("0 = to shut down");
        System.out.println("1 = to add item(s) to list (comma delimited list)");
        System.out.println("2 = to remove any items (comma delimited list)");
        System.out.println("Enter a number for which action you want to do:");
    }

    private static void addItems(){
        scanner.nextLine();
        System.out.println("comma delimited list");
        String input = scanner.nextLine();
        String[] inputList = input.split(",");
        for(int i=0; i<inputList.length; i++){
            if(!list.contains(inputList[i].trim())){
                list.add(inputList[i].trim());
            }
        }
        sortList(list);
        System.out.println(list);
    }

    private static void removeItems(){
        scanner.nextLine();
        System.out.println("comma delimited list");
        String input = scanner.nextLine();
        String[] inputList = input.split(",");
        list.removeAll(Arrays.asList(inputList));
        sortList(list);
        System.out.println(list);
    }

    private static void sortList(List<String> list){
        list.sort(Comparator.naturalOrder());
    }

}//class
