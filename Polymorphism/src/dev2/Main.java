package dev2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Movie theMovie = new Adventure("Star Wars");
//        theMovie.watchMovie();
//          //The actual runtime type is determined by the JVM based on the object created in the heap.
//          //The variable is declared as type Movie (stack),
//          //but it is assigned an object of type Adventure (heap).
//
//        System.out.println(theMovie instanceof Adventure);
//        System.out.println(theMovie instanceof Movie);
//
//        Movie movie1 = Movie.getMovie("Adventure", "Star Wars");
//        movie1.watchMovie();
//
//
//        Movie movie2 = Movie.getMovie("s", "Star Wars");
//        movie2.watchMovie();

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter A, C, S or Q");
            String type = scanner.nextLine();
            if("Qq".contains(type)) {
                break;
            }
            System.out.print("Movie title?");
            String title = scanner.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }



    }
}
