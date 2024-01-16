package dev2;

public class NextMain {

    public static void main(String[] args) {

        Movie movie1 = Movie.getMovie("a", "Jaws");
        movie1.watchMovie();

        //Adventure jaws = Movie.getMovie("a", "Jaws");
        Adventure jaws = (Adventure) Movie.getMovie("a", "Jaws");
        jaws.watchMovie();

        //Object comedy = Movie.getMovie("c", "Airplane");
        //comedy.watchMovie();

        //Object comedy = Movie.getMovie("c", "Airplane");
        //Movie comedyMovie = (Movie) comedy;
        //comedyMovie.watchComedy();

        Object comedy = Movie.getMovie("c", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("c", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();
    }
}
