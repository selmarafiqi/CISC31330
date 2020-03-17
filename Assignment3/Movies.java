
import java.util.*;

public class Movies{
    private List<Movie> movies; //using the interface

    public Movies(){
        movies = new ArrayList<>();
    }

    public void add (Movie movie){
        movies.add(movie);
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        for(Movie movie: movies){
            result.append(movie.toString() + "\n");
        }

        return result.toString();
    }

    public void sortByTitle(){
        Collections.sort(movies);
    }

    public Movie findbyTitle(String title){
        Movie m = new Movie ("", title);
        int index = Collections.binarySearch(movies, m);
        return movies.get(index);
    }
}