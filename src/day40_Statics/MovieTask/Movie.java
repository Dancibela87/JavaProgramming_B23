package day40_Statics.MovieTask;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String title, country, genre, director;
    public LocalDate releaseDate;
    public ArrayList<String> casts = new ArrayList<>();

    public void setInfo(String title, String country, String genre, String director, LocalDate releaseDate) {
        this.title = title;
        this.country = country;
        this.genre = genre;
        this.director = director;
        this.releaseDate = releaseDate;
    }

    public void addCast(String cast){
        casts.add(cast);
    }

    public void addCast(String[] casts){
        this.casts.addAll( Arrays.asList(casts) );
    }

    public void addCast(ArrayList<String> casts){
        this.casts.addAll( casts );
    }

    public String toString() { // January/01/2021 Tuesday
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/YYYY EEEE");
        return "Movie{" +
                "title= '" + title + '\'' +
                ", country= '" + country + '\'' +
                ", genre= '" + genre + '\'' +
                ", director= '" + director + '\'' +
                ", releaseDate= " + releaseDate.format(df) +
                ", total number of casts= " + casts.size() +
                '}';
    }
}
