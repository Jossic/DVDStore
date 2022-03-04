package com.lapidev.dvdstore;

import com.lapidev.dvdstore.entity.Movie;
import com.lapidev.dvdstore.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Saisissez un titre ?" );
        String title = sc.nextLine();

        System.out.println( "Saisissez un genre ?" );
        String genre = sc.nextLine();

        Movie newMovie = new Movie();
        newMovie.setTitle(title);
        newMovie.setGenre(genre);

        MovieService movieService = new MovieService();
        movieService.registerMovie(newMovie);
    }
}
