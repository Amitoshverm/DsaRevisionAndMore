package OOPs.Polymorphism;

public class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public void watchMovie() {
        String instanceOfMovie = getClass().getSimpleName();
        System.out.println(name + " is a " + instanceOfMovie+ " film");
    }


    // This is factory method ->
    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new Scifi(title);
            default -> new Movie(title);
        };
    }
}
class Adventure extends Movie {

    public Adventure(String name) {
        super(name);
    }
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(" . . %s%n".repeat(3),
                "Pleasant scene",
                "Scary Music",
                "bad Ending");
    }
}
class Comedy extends Movie {

    public Comedy(String name) {
        super(name);
    }
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(" . . %s%n".repeat(3),
                "Funny Start",
                "More funnier thing came",
                "happy ending");
    }
}
class Scifi extends Movie {

    public Scifi(String name) {
        super(name);
    }
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(" . . %s%n".repeat(3),
                "some crucial opening",
                "mind bending",
                "suspenseful ending");
    }
}



