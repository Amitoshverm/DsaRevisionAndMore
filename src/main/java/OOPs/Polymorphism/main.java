package OOPs.Polymorphism;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//       Movie movie1 = Movie.getMovie("Adventure", "Star Wars");
//       movie1.watchMovie();
//
//       Movie movie2 = Movie.getMovie("Scifi", "Interstellar");
//       movie2.watchMovie();
//
//       Movie movie3 = Movie.getMovie("Comedy", "21 jump street");
//       movie3.watchMovie();
        Scanner in = new Scanner(System.in);
//        String type = in.nextLine();
//        String title = in.nextLine();
//        Movie movie = Movie.getMovie(type, title);
//        movie.watchMovie();
//        while (true) {
//            System.out.print("Enter the following for the genre- A for adventure, C for comedy, S for scifi and Q for quit : ");
//            String type = in.nextLine();
//            if ("Qq".contains(type)) {
//                break;
//            }
//            System.out.print("enter Movie title: ");
//            String title = in.nextLine();
//            Movie movie = Movie.getMovie(type, title);
//            movie.watchMovie();
//        }
        Object unknownObject = Movie.getMovie("S", "Interstellar");
        if (unknownObject.getClass().getSimpleName().equals("Comedy")) {
            Comedy c = (Comedy) unknownObject;
            c.watchMovie();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchMovie();
        } else if (unknownObject instanceof Scifi syfi) {
            syfi.watchMovie();
        }

    }
}
