package dk.kea;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Movie m1 = new Movie("Filmen", 4, 2020, 200);
        Movie m2 = new Movie("Abekongen", 9, 2019, 300);
        Movie m3 = new Movie("Prinsessen", 2, 2018, 250);
        Movie m4 = new Movie("Wilderbeast", 7, 2019, 210);
        Movie m5 = new Movie("Hejsa med digsa", 90, 1920, 320);
        Movie m6 = new Movie("Kattemad", 400, 1940, 20);
        Movie m7 = new Movie("Aften", 20, 1994, 30);
        List<Movie> movieList = Arrays.asList(m1,m2,m3,m4,m5,m6,m7);

        for (Movie film : movieList){
            System.out.println("Alle film: " + film);
        }
        System.out.println(" ");
        List<String> longMovies = movieList.stream()
                .filter(s -> s.getDuration() > 200)
                .map(s -> s.getFilmName())
                .collect(Collectors.toList());

        for (String name : longMovies){
            System.out.println("Denne er længere end 200 min: " + name);
        }
        System.out.println(" ");
        List<Movie> moviesWithA = movieList.stream()
                .filter(s -> s.getFilmName().startsWith("A"))
                .sorted((s, p) -> s.getFilmName().compareTo(p.getFilmName()))
                .collect(Collectors.toList());

        for (Movie mov : moviesWithA){
            System.out.println("Denne starter med a: " + mov);
        }
        System.out.println(" ");
        for (Movie film : movieList){
            System.out.println("Alle film: " + film);
        }

    }
}
