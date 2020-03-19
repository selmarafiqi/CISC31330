import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import com.opencsv.CSVReader;

import java.io.*;

public class Main{
    public static final int ID_COL = 1;
    public static final int TITLE_COL = 2;
    public static final int GENRE_COL = 3;

    public static Movie createMovie(String[] row){
        Movie m = new Movie(row[ID_COL], null);
        m.setTitle(row[TITLE_COL]);
        m.setGenre(row[GENRE_COL]);
        return m;
    }

    public static Movies createMovies(String filename){
        CSVReader br = new CSVReader(new FileReader(filename));
        String [] line;
        Movies movies = new Movies();
        while((line = br.readLine()) !=null){
            Movie movie = createMovie(line);
            movies.add(movie);
        }

        return movies;
    }

    public static void main (String[] args) throws IOException{
        Movies movies = createMovies("movies.csv");
        System.out.println(movies);
        movies.sortByTitle();
        Movie m = movies.findbyTitle("Toy Story");

        System.out.println("Found it!: " + m);
    }
}
