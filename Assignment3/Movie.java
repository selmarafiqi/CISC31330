public class Movie implements Comparable<Movie>{

    private String title;
    private String genre;
    private int id;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(String genre){
        this.genre= genre;
    }

    public int getID(){
        return id;
    }

    public void setID(int id){
        this.id=id;
    }

    public Movie(String genre, String title){
        this.title = title;
        this.genre = genre;
    }

    public String toString(){
        return title;
    }

    public int compareTo(Movie o){
       return  title.compareTo(o.getTitle());
    }

}