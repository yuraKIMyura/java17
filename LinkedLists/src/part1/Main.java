package part1;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        List<String> placesToVisitList = new LinkedList<>();

        //var로 해도 compiler가
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        //removeElements(placesToVisit);
        //System.out.println(placesToVisit);

        gettingElements(placesToVisit);

        printItinerary3(placesToVisit);

        //testIterator(placesToVisit);
        testIterator2(placesToVisit);

    }//main

    private static void addMoreElements(LinkedList<String> list){
        System.out.println("-".repeat(40));

        /**List**/
        list.addFirst("Darwin");
        list.addLast("Hobart");

        /**Queue**/
        list.offer("Melbourne");

        /**Deque**/
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        /**Stack**/
        list.push("Alice Springs");

    }//method

    private static void removeElements(LinkedList<String> list){
        System.out.println("-".repeat(40));

        list.remove(4);
        list.remove("Brisbane");

        String s1 = list.remove();
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");


        /**Queue/Deque**/
        String p1 = list.poll();
        System.out.println(p1 + " was polled");

        String p2 = list.pollFirst();
        System.out.println(p2 + " was polled");

        String p3 = list.pollLast();
        System.out.println(p3 + " was polled");


        //method 연습을 위해 element 채워넣기
        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop();
        System.out.println(p4 + " was popped");

    }//method


    private static void gettingElements(LinkedList<String> list){
        System.out.println("-".repeat(40));

        System.out.println("Retrieved Element = " + list.get(4));

        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());

        System.out.println("Darwin is at index = " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at index = " + list.indexOf("Melbourne"));

        /**Queue retrieval method**/
        System.out.println("Element from element() = " + list.element());
        /**Stack retrieval method**/
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());

    }//method


    private static void printItinerary(LinkedList<String> list){
        System.out.println("-".repeat(40));
        System.out.println("Trip starts at "+ list.getFirst());
        for(int i=0 ; i<list.size()-1; i++){
            System.out.println("--> From " + list.get(i) + ", to " + list.get(i+1));
        }
        System.out.println("Trip ends at "+ list.getLast());
    }


    private static void printItinerary2(LinkedList<String> list){
        System.out.println("-".repeat(40));
        System.out.println("Trip starts at "+ list.getFirst());
        String previousTown = list.getFirst();
        for(String town : list)
        {
            System.out.println("-> From " + previousTown + ", to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at "+ list.getLast());
    }


    private static void printItinerary3(LinkedList<String> list){
        System.out.println("-".repeat(40));
        System.out.println("Trip starts at "+ list.getFirst());
        String previousTown = list.getFirst();

        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()){
            var town = iterator.next();
            System.out.println("- From " + previousTown + ", to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }//method


    private static void testIterator(LinkedList<String> list){
        System.out.println("-".repeat(40));
        /**This returns ListIterator**/
        var iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            if(iterator.next().equals("Brisbane")){
                iterator.remove();
            }
        }
        System.out.println(list);
    }//method


    private static void testIterator2(LinkedList<String> list){
        System.out.println("-".repeat(40));

        var iterator = list.listIterator();

        while (iterator.hasNext()){
            //System.out.println(iterator.next());
            if(iterator.next().equals("Brisbane")){
                iterator.remove();
                iterator.add("Lake Wivenhoe");
            }
        }
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.previous());
    }//method

}//class
