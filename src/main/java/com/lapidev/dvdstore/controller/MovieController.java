package com.lapidev.dvdstore.controller;

import com.lapidev.dvdstore.entity.Movie;
import com.lapidev.dvdstore.service.MovieService;

import java.util.Scanner;

public class MovieController {

    private MovieService movieService= new MovieService();

    public void addUsingConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Saisissez un titre ?" );
        String title = sc.nextLine();

        System.out.println( "Saisissez un genre ?" );
        String genre = sc.nextLine();

        System.out.println(title +" - " + genre);
        Movie newMovie = new Movie();
        newMovie.setTitle(title);
        newMovie.setGenre(genre);

        movieService.registerMovie(newMovie);
    }

}
