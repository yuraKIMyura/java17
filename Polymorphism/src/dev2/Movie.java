package dev2;

public class Movie {

    private String title;

    public Movie(String title){
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        //여기서 this는 watchMovie()가 호출된 instance variable을 가리킨다
        //즉, current instance라고 표현되는 녀석
        System.out.println(title + " is a " +instanceType + " film");
    }

    public static Movie getMovie(String type, String title){

        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }

}//class

class Adventure extends Movie{

    public Adventure(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
        "Pleasant scene",
        "Scary music plays",
        "Something bad happens");
    }

    public void watchAdventure(){
        System.out.println("Watching an Adventure");
    }

}

class Comedy extends Movie{

    public Comedy(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "comedy",
                "laughter",
                "more laughter");
    }

    public void watchComedy(){
        System.out.println("Watching a Comedy");
    }
}

class ScienceFiction extends Movie{

    public ScienceFiction(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Aliens",
                "Space",
                "War");
    }

    public void watchScienceFiction(){
        System.out.println("Watching a sci-fi");
    }
}